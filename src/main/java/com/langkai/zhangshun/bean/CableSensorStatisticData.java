package com.langkai.zhangshun.bean;

import com.google.gson.annotations.SerializedName;

public class CableSensorStatisticData {

    @SerializedName("avg")
    private CableSensorMetaData<Double> avgValue;

    @SerializedName("max")
    private CableSensorMetaData<Double> maxValue;

    @SerializedName("min")
    private CableSensorMetaData<Double> minValue;

    @SerializedName("mmr")
    private CableSensorMetaData<Double> maxMinRatio;

    public CableSensorMetaData<Double> getAvgValue() {
        return avgValue;
    }

    public void setAvgValue(CableSensorMetaData<Double> avgValue) {
        this.avgValue = avgValue;
    }

    public CableSensorMetaData<Double> getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(CableSensorMetaData<Double> maxValue) {
        this.maxValue = maxValue;
    }

    public CableSensorMetaData<Double> getMinValue() {
        return minValue;
    }

    public void setMinValue(CableSensorMetaData<Double> minValue) {
        this.minValue = minValue;
    }

    public CableSensorMetaData<Double> getMaxMinRatio() {
        return maxMinRatio;
    }

    public void setMaxMinRatio(CableSensorMetaData<Double> maxMinRatio) {
        this.maxMinRatio = maxMinRatio;
    }
}
