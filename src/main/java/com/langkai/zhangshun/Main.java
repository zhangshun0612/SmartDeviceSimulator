package com.langkai.zhangshun;

import com.google.gson.Gson;
import com.langkai.zhangshun.bean.SmartDeviceBaseMessage;
import com.langkai.zhangshun.bean.SmartDeviceMessage;
import com.langkai.zhangshun.bean.SmartDeviceMetaData;
import com.langkai.zhangshun.bean.SmartDeviceNormalData;

import java.lang.reflect.Type;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("Smart Device Simulator");

        Gson gson = new Gson();
/*
        SmartDeviceMetaData<Double> realtimeVal = new SmartDeviceMetaData<Double>(23.33, System.currentTimeMillis());
        SmartDeviceMetaData<Integer> vibVal = new SmartDeviceMetaData<Integer>(1, System.currentTimeMillis());

        SmartDeviceNormalData nmData = new SmartDeviceNormalData();
        nmData.setRealTimeValue(realtimeVal);
        nmData.setIsVibration(vibVal);

        SmartDeviceMessage<SmartDeviceNormalData> msg = new SmartDeviceMessage<SmartDeviceNormalData>();
        msg.setData(nmData);
        msg.setDeviceId("123456ABC");
        msg.setMsgType("normal");
        msg.setChannelType("A");

        String jsonStr = gson.toJson(msg);

        System.out.println(jsonStr);

        SmartDeviceMessage<SmartDeviceNormalData> rcvMsg =  SmartDeviceMessage.fromJson(jsonStr, SmartDeviceNormalData.class);

        System.out.println(rcvMsg.getData().getRealTimeValue().getValue());
        System.out.println(rcvMsg.getData().getIsVibration().getValue());
        */
/*
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
*/

    }
}
