package org.example.hotel;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建Hotel
        Hotel hotel = new Hotel();

        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明：");
        System.out.println("请通过选择对应的功能编号来使用对应的功能：");
        System.out.println("【1】查看酒店所有的房间状态");
        System.out.println("【2】预定房间");
        System.out.println("【3】退房");
        System.out.println("【0】退出系统");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("请输入功能编号：");
            //获取功能编号
            int no = s.nextInt();

            switch (no) {
                case 1 -> hotel.display();
                case 2 -> {
                    System.out.print("请输入预定的房间号：");
                    int roomNo = s.nextInt();
                    hotel.order(roomNo);
                    System.out.println("预定房间【" + roomNo + "】成功！");
                }
                case 3 -> {
                    System.out.print("请输入退房的房间号：");
                    int roomNo = s.nextInt();
                    hotel.exit(roomNo);
                    System.out.println("退房【" + roomNo + "】成功！");
                }
                case 0 -> {
                    System.out.print("再见，欢迎下次使用！");
                    //退出系统，终止JVM
                    System.exit(0);
                }
            }
        }
    }
}
