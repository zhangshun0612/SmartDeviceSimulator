package com.langkai.zhangshun.bean;

public class CableSensorChannels {
    public final static int M_CABLE = 1;
    public final static int A_CABLE = 2;
    public final static int B_CABLE = 3;
    public final static int C_CABLE = 4;

    public final static int A_EARTH = 5;
    public final static int B_EARTH = 6;
    public final static int C_EARTH = 7;
    public final static int N_EARTH = 8;

    public final static int A_TEMP = 9;
    public final static int B_TEMP = 10;
    public final static int C_TEMP = 11;

    public static String getChannelString(int ch){
        String str = "未知";
        switch (ch){
            case M_CABLE:
                str = "主缆电流";
                break;
            case A_CABLE:
                str = "A相电流";
                break;
            case B_CABLE:
                str = "B相电流";
                break;
            case C_CABLE:
                str = "C相电流";
                break;
            case A_EARTH:
                str = "A相接地电流";
                break;
            case B_EARTH:
                str = "B相接地电流";
                break;
            case C_EARTH:
                str = "C相接地电流";
                break;
            case N_EARTH:
                str = "N相接地电流";
                break;
            case A_TEMP:
                str = "A相温度";
                break;
            case B_TEMP:
                str = "B相温度";
                break;
            case C_TEMP:
                str = "C相温度";
                break;
        }

        return str;
    }
}
