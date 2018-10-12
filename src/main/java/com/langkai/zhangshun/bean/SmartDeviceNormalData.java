package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class SmartDeviceNormalData {

    @SerializedName("cur_rt")
    private SmartDeviceMetaData<Double> currentRealTimeValue;

    @SerializedName("cur_avg")
    private SmartDeviceMetaData<Double> currentAvgValue;

    @SerializedName("cur_max")
    private SmartDeviceMetaData<Double> currentmMaxValue;

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


}
