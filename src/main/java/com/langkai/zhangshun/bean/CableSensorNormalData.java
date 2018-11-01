package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class CableSensorNormalData {

    @SerializedName("rt")
    private CableSensorMetaData<Double> realTimeValue;

    @SerializedName("ecr")
    private CableSensorMetaData<Double> electricChangeRate;

    public CableSensorMetaData<Double> getRealTimeValue() {
        return realTimeValue;
    }

    public void setRealTimeValue(CableSensorMetaData<Double> realTimeValue) {
        this.realTimeValue = realTimeValue;
    }

    public CableSensorMetaData<Double> getElectricChangeRate() {
        return electricChangeRate;
    }

    public void setElectricChangeRate(CableSensorMetaData<Double> electricChangeRate) {
        this.electricChangeRate = electricChangeRate;
    }

}
