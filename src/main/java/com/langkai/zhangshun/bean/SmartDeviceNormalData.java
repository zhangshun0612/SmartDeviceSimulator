package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class SmartDeviceNormalData {

    @SerializedName("cur_rt")
    private SmartDeviceMetaData<Double> currentRealTimeValue;

    @SerializedName("cur_avg")
    private SmartDeviceMetaData<Double> currentAvgValue;

    @SerializedName("cur_max")
    private SmartDeviceMetaData<Double> currentMaxValue;

    @SerializedName("cur_min")
    private SmartDeviceMetaData<Double> currentMinValue;

    @SerializedName("cur_elr_rt")
    private SmartDeviceMetaData<Double> currentChargeRatio; //环流与电缆负荷比实时值

    @SerializedName("cur_mmr_rt")
    private SmartDeviceMetaData<Double> currentMaxMinRatio; //环流最大值与最小值实时值

    @SerializedName("temp_rt")
    private SmartDeviceMetaData<Double> temperatureRealtimeValue; //温度实时值

    @SerializedName("temp_avg")
    private SmartDeviceMetaData<Double> temperatureAvgValue; //温度平均值

    @SerializedName("temp_max")
    private SmartDeviceMetaData<Double> temperatureMaxValue; //温度最大值

    @SerializedName("temp_min")
    private SmartDeviceMetaData<Double> temperatureMinValue; //温度最小值

    @SerializedName("vib")
    private SmartDeviceMetaData<Integer> isVibration; //振动状态

    public SmartDeviceMetaData<Double> getCurrentRealTimeValue() {
        return currentRealTimeValue;
    }

    public void setCurrentRealTimeValue(SmartDeviceMetaData<Double> currentRealTimeValue) {
        this.currentRealTimeValue = currentRealTimeValue;
    }

    public SmartDeviceMetaData<Double> getCurrentAvgValue() {
        return currentAvgValue;
    }

    public void setCurrentAvgValue(SmartDeviceMetaData<Double> currentAvgValue) {
        this.currentAvgValue = currentAvgValue;
    }

    public SmartDeviceMetaData<Double> getCurrentMaxValue() {
        return currentMaxValue;
    }

    public void setCurrentMaxValue(SmartDeviceMetaData<Double> currentMaxValue) {
        this.currentMaxValue = currentMaxValue;
    }

    public SmartDeviceMetaData<Double> getCurrentMinValue() {
        return currentMinValue;
    }

    public void setCurrentMinValue(SmartDeviceMetaData<Double> currentMinValue) {
        this.currentMinValue = currentMinValue;
    }

    public SmartDeviceMetaData<Double> getCurrentChargeRatio() {
        return currentChargeRatio;
    }

    public void setCurrentChargeRatio(SmartDeviceMetaData<Double> currentChargeRatio) {
        this.currentChargeRatio = currentChargeRatio;
    }

    public SmartDeviceMetaData<Double> getCurrentMaxMinRatio() {
        return currentMaxMinRatio;
    }

    public void setCurrentMaxMinRatio(SmartDeviceMetaData<Double> currentMaxMinRatio) {
        this.currentMaxMinRatio = currentMaxMinRatio;
    }

    public SmartDeviceMetaData<Double> getTemperatureRealtimeValue() {
        return temperatureRealtimeValue;
    }

    public void setTemperatureRealtimeValue(SmartDeviceMetaData<Double> temperatureRealtimeValue) {
        this.temperatureRealtimeValue = temperatureRealtimeValue;
    }

    public SmartDeviceMetaData<Double> getTemperatureAvgValue() {
        return temperatureAvgValue;
    }

    public void setTemperatureAvgValue(SmartDeviceMetaData<Double> temperatureAvgValue) {
        this.temperatureAvgValue = temperatureAvgValue;
    }

    public SmartDeviceMetaData<Double> getTemperatureMaxValue() {
        return temperatureMaxValue;
    }

    public void setTemperatureMaxValue(SmartDeviceMetaData<Double> temperatureMaxValue) {
        this.temperatureMaxValue = temperatureMaxValue;
    }

    public SmartDeviceMetaData<Double> getTemperatureMinValue() {
        return temperatureMinValue;
    }

    public void setTemperatureMinValue(SmartDeviceMetaData<Double> temperatureMinValue) {
        this.temperatureMinValue = temperatureMinValue;
    }

    public SmartDeviceMetaData<Integer> getIsVibration() {
        return isVibration;
    }

    public void setIsVibration(SmartDeviceMetaData<Integer> isVibration) {
        this.isVibration = isVibration;
    }
}
