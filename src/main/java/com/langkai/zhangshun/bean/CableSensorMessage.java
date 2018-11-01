package com.langkai.zhangshun.bean;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class CableSensorMessage<T> {

    public static String MSG_TYPE_NORMAL = "normal";
    public static String MSG_TYPE_STATISTIC = "statis";
    public static String MSG_TYPE_ALARM = "alarm";

    public static String CHANNEL_A_EARTH = "A_EARTH";
    public static String CHANNEL_B_EARTH = "B_EARTH";
    public static String CHANNEL_C_EARTH = "C_EARTH";
    public static String CHANNEL_N_EARTH = "N_EARTH";

    public static String CHANNEL_A_CABLE = "A_CABLE";
    public static String CHANNEL_B_CABLE = "B_CABLE";
    public static String CHANNEL_C_CABLE = "C_CABLE";
    public static String CHANNEL_CABLE = "CABLE";

    public static String CHANNEL_A_TEMP = "A_TEMP";
    public static String CHANNEL_B_TEMP = "B_TEMP";
    public static String CHANNEL_C_TEMP = "C_TEMP";

    public static String CHANNEL_A_VIB = "A_VIB";
    public static String CHANNEL_B_VIB = "B_VIB";
    public static String CHANNEL_C_VIB = "C_VIB";
    public static String CHANNEL_N_VIB = "N_VIB";

    @SerializedName("c_id")
    private String bindingDeviceId;

    @SerializedName("d_id")
    private String sensorId;

    @SerializedName("mtp")
    private String msgType;

    @SerializedName("ch")
    private String channel;

    @SerializedName("msg")
    private T data;

    public String getBindingDeviceId() {
        return bindingDeviceId;
    }

    public void setBindingDeviceId(String bindingDeviceId) {
        this.bindingDeviceId = bindingDeviceId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



    public static CableSensorMessage fromJson(String json) {
        Gson gson = new Gson();
        try {
            return gson.fromJson(json, CableSensorMessage.class);
        } catch (JsonSyntaxException e) {
            return null;
        }
    }

    public static  <T> T fromJson(String json, Type typeOfT)
    {
        Gson gson = new Gson();
        try{
            return gson.fromJson(json, typeOfT);
        }catch(JsonSyntaxException e){
            return null;
        }
    }

}
