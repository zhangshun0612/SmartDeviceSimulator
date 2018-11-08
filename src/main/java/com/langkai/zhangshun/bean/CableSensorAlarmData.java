package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class CableSensorAlarmData {

    public static final String ALARM_THREHOLD = "th_alr";
    public static final String ALARM_CHANGERATE = "chr_alr";
    public static final String ALARM_ELECTRIC_CHANGERATE = "ecr_alr";
    public static final String ALARM_MAXMIN_RATIO = "mmr_alr";
    public static final String ALARM_VIB = "vib_alr";
    public static final String ALARM_VIB_BREAK = "vib_br_alr";

    @SerializedName("val")
    private double value;

    @SerializedName("tp")
    private long timestamp;

    @SerializedName("atp")
    private String alarmType;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }
}
