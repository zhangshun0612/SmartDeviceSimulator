package com.langkai.zhangshun.bean;

public class SmartDeviceMetaData<T> {
    private T value;
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
