package com.langkai.zhangshun.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class SmartDeviceMessage<T> extends SmartDeviceBaseMessage{
    @SerializedName("msg")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static SmartDeviceMessage fromJson(String json, Class clazz) {
        Gson gson = new Gson();
        Type objectType = type(SmartDeviceMessage.class, clazz);

        return gson.fromJson(json, objectType);
    }

    static ParameterizedType type(final Class raw, final Type... args) {
        return new ParameterizedType() {
            public Type getRawType() {
                return raw;
            }

            public Type[] getActualTypeArguments() {
                return args;
            }

            public Type getOwnerType() {
                return null;
            }
        };
    }
}
