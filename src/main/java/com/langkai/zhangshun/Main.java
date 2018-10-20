package com.langkai.zhangshun;

import com.google.gson.Gson;
import com.langkai.zhangshun.bean.*;
import com.langkai.zhangshun.service.AliIotMqttService;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    static String deviceName = "lk_device_IM2211C_0002";
    static String deviceSecret = "IcGjhDLmm7hnpHaABtxIa5IU82xJu2Ab";

    static String productKey = "a1E6VCCsule";
    static Random random = new Random();

    static AliIotMqttService iotService;
    public static void main(String[] args){
        System.out.println("Smart Device Simulator");

        /*
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
        */

        SmartDeviceMessage<SmartDeviceRealTimeData> msg = new SmartDeviceMessage<SmartDeviceRealTimeData>();

        SmartDeviceRealTimeData rt = new SmartDeviceRealTimeData();
        rt.setRealTimeValue(new SmartDeviceMetaData<Double>(generateRandomValue(10), System.currentTimeMillis()));
        rt.setElectricChargeRatio(new SmartDeviceMetaData<Double>(generateRandomValue(1), System.currentTimeMillis()));

        msg.setChannelType("A_CABLE");
        msg.setMsgType("normal");
        msg.setDeviceId("12345678ABCD");
        msg.setData(rt);

        Gson gson = new Gson();
        String jsonStr = gson.toJson(msg);

        System.out.println(jsonStr);

    }


    static double generateRandomValue(double multiVal)
    {
        return random.nextDouble() * multiVal;
    }

    static String generateRealTimeMessage()
    {
        SmartDeviceMessage<SmartDeviceRealTimeData> msg = new SmartDeviceMessage<SmartDeviceRealTimeData>();

        SmartDeviceRealTimeData rt = new SmartDeviceRealTimeData();
        rt.setRealTimeValue(new SmartDeviceMetaData<Double>(generateRandomValue(10), System.currentTimeMillis()));
        rt.setElectricChargeRatio(new SmartDeviceMetaData<Double>(generateRandomValue(1), System.currentTimeMillis()));

        msg.setChannelType("A_CABLE");
        msg.setMsgType("normal");
        msg.setDeviceId("12345678ABCD");
        msg.setData(rt);

        Gson gson = new Gson();
        String jsonStr = gson.toJson(msg);

        return jsonStr;
    }
}
