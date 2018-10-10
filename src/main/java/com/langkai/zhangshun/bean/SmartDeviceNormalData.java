package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class SmartDeviceNormalData {

    @SerializedName("ph")
    private String phase;

    @SerializedName("rt")
    private double realtimeValue;

    @SerializedName("avg")
    private double avgValue;

    @SerializedName("max")
    private double maxValue;

    @SerializedName("min")
    private double minValue;

    @SerializedName("cr")
    private Double changeRate;

    @SerializedName("tmp")
    private double temperature;

    @SerializedName("vb")
    private boolean isVibration;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public double getRealtimeValue() {
        return realtimeValue;
    }

    public void setRealtimeValue(double realtimeValue) {
        this.realtimeValue = realtimeValue;
    }

    public double getAvgValue() {
        return avgValue;
    }

    public void setAvgValue(double avgValue) {
        this.avgValue = avgValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public Double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Double changeRate) {
        this.changeRate = changeRate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isVibration() {
        return isVibration;
    }

    public void setVibration(boolean vibration) {
        isVibration = vibration;
    }


}
