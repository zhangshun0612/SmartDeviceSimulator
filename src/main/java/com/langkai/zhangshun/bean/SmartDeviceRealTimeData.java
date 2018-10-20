package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class SmartDeviceRealTimeData {

    @SerializedName("rt")
    private SmartDeviceMetaData<Double> realTimeValue;

    public SmartDeviceMetaData<Double> getRealTimeValue() {
        return realTimeValue;
    }

    public void setRealTimeValue(SmartDeviceMetaData<Double> realTimeValue) {
        this.realTimeValue = realTimeValue;
    }

    public SmartDeviceMetaData<Double> getElectricChargeRatio() {
        return electricChargeRatio;
    }

    public void setElectricChargeRatio(SmartDeviceMetaData<Double> electricChargeRatio) {
        this.electricChargeRatio = electricChargeRatio;
    }

    @SerializedName("ecr")
    private SmartDeviceMetaData<Double> electricChargeRatio;



}
