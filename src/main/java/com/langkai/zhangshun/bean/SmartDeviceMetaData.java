package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class SmartDeviceMetaData<T> {
    @SerializedName("val")
    private T value;

    @SerializedName("tp")
    private long timestamp;

    public SmartDeviceMetaData(T value, long timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
