package com.langkai.zhangshun;

import com.google.gson.Gson;
import com.langkai.zhangshun.bean.*;
import com.langkai.zhangshun.service.AliIotMqttService;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Main {


    static String deviceName = "lk_device_IM2211C_0001";
    static String deviceSecret = "ieDuYZhc70BHONuWYGKAXuv1V3Mueq0Q";

    static String productKey = "a1E6VCCsule";
    static Random random = new Random();

    static AliIotMqttService iotService;
    public static void main(String[] args){
        System.out.println("Smart Device Simulator");
        AliIotDevice device = new AliIotDevice();
        device.setName(deviceName);
        device.setSecret(deviceSecret);

        iotService = new AliIotMqttService();
        try {
            iotService.mqttConnect("IM2211C_0002", productKey, device);
        } catch (MqttException e) {
            e.printStackTrace();
            System.out.println("Connect to IotHub Failed");
            return;
        }


        System.out.println("连接成功");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cmdLine = "";
        while(true){
            try {
                cmdLine = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

            if(cmdLine.equals("quit")){
                break;
            }else if(cmdLine.startsWith("send")){
                String chDef = CableSensorMessage.CHANNEL_A_CABLE;

                String[] cmdArgs = cmdLine.split(" ");
                if(cmdArgs.length == 2){
                    chDef = cmdArgs[1];
                }

                String msg = generateNormalMessage(chDef);

                System.out.println(msg);

                try {
                    iotService.mqttPublish(msg);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    static double generateRandomValue(double multiVal)
    {
        return random.nextDouble() * multiVal;
    }

    static String generateNormalMessage(String channel)
    {
        CableSensorMessage<CableSensorNormalData> msg = new CableSensorMessage<CableSensorNormalData>();

        CableSensorNormalData rt = new CableSensorNormalData();
        rt.setRealTimeValue(new CableSensorMetaData<Double>(generateRandomValue(10), System.currentTimeMillis()));
        rt.setElectricChangeRate(new CableSensorMetaData<Double>(generateRandomValue(1), System.currentTimeMillis()));

        msg.setChannel(channel);
        msg.setMsgType(CableSensorMessage.MSG_TYPE_NORMAL);
        msg.setBindingDeviceId("IM2211C_0001");
        msg.setSensorId("123456789ABCD");
        msg.setData(rt);

        Gson gson = new Gson();
        String jsonStr = gson.toJson(msg);
        return jsonStr;
    }



}
