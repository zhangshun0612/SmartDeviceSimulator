package com.langkai.zhangshun;

import com.google.gson.Gson;
import com.langkai.zhangshun.bean.SmartDeviceBaseMessage;
import com.langkai.zhangshun.bean.SmartDeviceMessage;
import com.langkai.zhangshun.bean.SmartDeviceNormalData;

import java.lang.reflect.Type;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("Smart Device Simulator");
        Gson gson = new Gson();

        Random rd = new Random();

        SmartDeviceNormalData data = new SmartDeviceNormalData();
        data.setPhase("M");
        data.setRealtimeValue(rd.nextDouble() * 10);
        data.setAvgValue(rd.nextDouble() * 10);
        data.setMaxValue(rd.nextDouble() * 10);
        data.setMinValue(rd.nextDouble() * 10);
        data.setChangeRate(rd.nextDouble());
        data.setTemperature(rd.nextDouble() * 30);

        SmartDeviceMessage<SmartDeviceNormalData> msg = new SmartDeviceMessage<SmartDeviceNormalData>();
        msg.setDeviceId("12345678ABCDEF");
        msg.setTimestamp(System.currentTimeMillis());
        msg.setMsgType("normal");
        msg.setData(data);


        String jsonStr = gson.toJson(msg);
        System.out.println(jsonStr);


        String jsonStr1 = "{\n" +
                "\t\"msg\": {\n" +
                "\t\t\"ph\": \"M\",\n" +
                "\t\t\"rt\": 5.616882385740658,\n" +
                "\t\t\"avg\": 4.921398098500255,\n" +
                "\t\t\"max\": 6.475501857995816,\n" +
                "\t\t\"min\": 7.012946761940655,\n" +
                "\t\t\"tmp\": 20.745688727010588,\n" +
                "\t\t\"vb\": false\n" +
                "\t},\n" +
                "\t\"id\": \"12345678ABCDEF\",\n" +
                "\t\"ts\": 1539160567336,\n" +
                "\t\"tp\": \"normal\"\n" +
                "}";


        SmartDeviceMessage<SmartDeviceNormalData> rcvmsg = SmartDeviceMessage.fromJson(jsonStr1, SmartDeviceNormalData.class);

        if(rcvmsg.getData() != null){
            System.out.println(rcvmsg.getData().getPhase());
            System.out.println(rcvmsg.getData().getChangeRate() == null);
        }else{
            System.out.println("No data");
        }


    }
}
