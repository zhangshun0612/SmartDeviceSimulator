package com.langkai.zhangshun.service;

import com.langkai.zhangshun.bean.AliIotDevice;
import com.langkai.zhangshun.utils.SignUtil;
import org.eclipse.paho.client.mqttv3.*;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class AliIotMqttService {
    public static final String aliIotAddress = "iot-as-mqtt.cn-shanghai.aliyuncs.com";

    private MqttClient mqttClient;
    private String pubTopic = "";

    private MqttCallback mCallback = new MqttCallback() {
        public void connectionLost(Throwable throwable) {
            System.out.println("Connection Lost");
        }

        public void messageArrived(String topic, MqttMessage message) throws Exception {
            System.out.println("Topic: " + topic);
            System.out.println("Message: " + message.toString());
        }

        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

        }
    };

    public void mqttConnect(String clientId, String productKey, AliIotDevice deviceInfo) throws MqttException {
        String brokeAddress = "tcp://" + productKey + "." + aliIotAddress + ":1883";

        String mqttClientId = clientId + "|securemode=3,signmethod=hmacsha1|";
        String mqttUsername = deviceInfo.getName() + "&" + productKey;

        pubTopic = "/" + productKey + "/" + deviceInfo.getName() + "/user/update";

        Map<String, String> params = new HashMap<String, String>();
        params.put("productKey", productKey);
        params.put("deviceName", deviceInfo.getName());
        params.put("clientId", clientId);

        String mqttPassword = SignUtil.sign(params, deviceInfo.getSecret(), "hmacsha1");
        System.out.println("Mqtt Password : " + mqttPassword);

        mqttClient = new MqttClient(brokeAddress, mqttClientId);

        MqttConnectOptions connOption = new MqttConnectOptions();
        connOption.setMqttVersion(4);
        connOption.setUserName(mqttUsername);
        connOption.setPassword(mqttPassword.toCharArray());
        connOption.setCleanSession(false);
        connOption.setKeepAliveInterval(65);

        mqttClient.setCallback(mCallback);
        mqttClient.connect(connOption);

    }

    public void mqttPublish(String msg) throws UnsupportedEncodingException, MqttException {
        if(mqttClient == null || !mqttClient.isConnected()){
            System.out.println("Service Not Connected");
            return;
        }

        MqttMessage message = new MqttMessage();
        message.setQos(1);
        message.setPayload(msg.getBytes("utf-8"));

        mqttClient.publish(pubTopic, message);
    }
}
