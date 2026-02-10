package com.imooc.jdk9;

public class Sample01Impl implements Sample01 {
    public static void main(String[] args) {
        Sample01 sample01 = new Sample01Impl();
        sample01.showInfo();
        sample01.showDetail();
    }

    @Override
    public void showDetail() {
//        Sample01.super.showDetail();
        System.out.println("详细信息");
        System.out.println("网址：www.imooc.com");
    }
}
