package com.imooc.model;

public class Tea {
    public Tea() {
    }

    public String getGifts(int n) {
        String str = "积攒" + n + "个，不够60个，无法领取奶茶。";
        if (n >= 100) {
            str = "积攒" + n + "个，送一杯乌龙玛奇朵加波霸加仙草加冰淇淋。";
        } else if (n >= 80) {
            str = "积攒" + n + "个，送一杯波霸奶茶加冰淇淋加奶霜。";
        } else if (n >= 60) {
            str = "积攒" + n + "个，送一杯珍珠奶茶。";
        }
        return str;
    }
}
