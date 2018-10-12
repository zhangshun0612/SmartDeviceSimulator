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
            iotService.mqttConnect("IM2211C_0001", productKey, device);
        } catch (MqttException e) {
            e.printStackTrace();
            System.out.println("Connect to IotHub Failed");
            return;
        }

        System.out.println("连接成功");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cmdLine = "";

        while (true)
        {
            try {
                cmdLine = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(cmdLine.equals("send")){
                String msg = generateNormalDataJson();
                System.out.println(msg);
                try {
                    iotService.mqttPublish(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Publish Failed");
                }

            }else if(cmdLine.equals("exit")){
                return;
            }
        }
    }

    static String generateNormalDataJson()
    {
        SmartDeviceNormalData nmData = new SmartDeviceNormalData();
        nmData.setCurrentRealTimeValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setCurrentAvgValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setCurrentAvgValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setCurrentMaxValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setCurrentMinValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setCurrentChargeRatio(new SmartDeviceMetaData<Double>(generateRandomValue(10), System.currentTimeMillis()));
        nmData.setCurrentMaxMinRatio(new SmartDeviceMetaData<Double>(generateRandomValue(5), System.currentTimeMillis()));
        nmData.setTemperatureRealtimeValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setTemperatureAvgValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setTemperatureMaxValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setTemperatureMinValue(new SmartDeviceMetaData<Double>(generateRandomValue(100), System.currentTimeMillis()));
        nmData.setIsVibration(new SmartDeviceMetaData<Integer>(1, System.currentTimeMillis()));

        SmartDeviceMessage<SmartDeviceNormalData> msg = new SmartDeviceMessage<SmartDeviceNormalData>();
        msg.setData(nmData);
        msg.setDeviceId("123456ABC");
        msg.setMsgType("normal");

        switch (random.nextInt() % 5)
        {
            case 0:
                msg.setChannelType("A");
                break;
            case 1:
                msg.setChannelType("B");
                break;
            case 2:
                msg.setChannelType("C");
                break;
            case 3:
                msg.setChannelType("N");
                break;
            case 4:
                msg.setChannelType("Cable");
                break;
             default:
                 msg.setChannelType("Cable");
        }

        Gson gson = new Gson();
        return gson.toJson(msg);
    }

    static double generateRandomValue(double multiVal)
    {
        return random.nextDouble() * multiVal;
    }
}
