package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class SmartDeviceBaseMessage {

    @SerializedName("id")
    private String deviceId;

    @SerializedName("mtp")
    private String msgType;

    @SerializedName("ch")
    private String channelType;

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}
