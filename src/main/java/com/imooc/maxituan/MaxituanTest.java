package com.imooc.maxituan;

import java.util.Scanner;

public class MaxituanTest {
    public static void main(String[] args) {
        MaxituanTest maxituanTest = new MaxituanTest();
        maxituanTest.menu();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("请输入表演者编号：");
            //获取功能编号
            int no = s.nextInt();

            switch (no) {
                case 1 -> {
                    Bear b1 = new Bear("Bill", 1);
                    b1.act();
                }
                case 2 -> {
                    Lion l1 = new Lion("Lain", 2, "灰色", "公");
                    l1.act();
                }
                case 3 -> {
                    Monkey m1 = new Monkey("Tom", 1, "金丝猴");
                    m1.act();
                }
                case 4 -> {
                    Parrot p1 = new Parrot("Rose", 1, "牡丹鹦鹉");
                    p1.act();
                }
                case 5 -> {
                    Clown c1 = new Clown("Kahle", 5);
                    c1.act();
                }

            }
            System.out.println("**************  是否继续观看（1/0）  **************");
            Scanner s1 = new Scanner(System.in);
            int no1 = s1.nextInt();
            switch (no1) {
                case 1 -> {
                    maxituanTest.menu();
                }
                case 0 -> {
                    System.out.print("再见，欢迎下次使用！");
                    //退出系统，终止JVM
                    System.exit(0);
                }
            }
        }
    }

    public void menu() {
        System.out.println("**************欢迎来到太阳马戏团**************");
        System.out.println("************** 请选择表演者 **************");
        System.out.println("**************   1、棕熊   **************");
        System.out.println("**************   2、狮子   **************");
        System.out.println("**************   3、猴子   **************");
        System.out.println("**************   4、鹦鹉   **************");
        System.out.println("**************   5、小丑   **************");
    }
}
