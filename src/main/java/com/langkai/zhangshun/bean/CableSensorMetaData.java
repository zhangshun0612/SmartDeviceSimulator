package com.langkai.zhangshun.bean;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class CableSensorMetaData<T> {


    @SerializedName("val")
    private T value;

    @SerializedName("tp")
    private long timestamp;

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


    public CableSensorMetaData(T value, long timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }


}
