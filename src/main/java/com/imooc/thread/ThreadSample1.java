package com.imooc.thread;

import java.util.Random;

public class ThreadSample1 {
    public static void main(String[] args) {
        new ThreadSample1().start();
//        System.out.println("参赛者A 10秒跑了100米");
//        System.out.println("参赛者B 10秒跑了100米");
//        System.out.println("参赛者C 10秒跑了100米");
    }

    public void start() {
        Runner threadA = new Runner();
        threadA.setName("参赛者A");
        Runner threadB = new Runner();
        threadB.setName("参赛者B");
        Runner threadC = new Runner();
        threadC.setName("参赛者C");
        threadA.start();
        threadB.start();
        threadC.start();
    }

    class Runner extends Thread {
        @Override
        public void run() {
            //书写模拟奔跑的程序
            Integer speed = new Random().nextInt(10);
            for (int i = 1; i <= 10; i++) {
                //每执行一次让当前的程序沉睡1秒钟时间
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                //getName，线程自带的名字
                System.out.println("第" + i + "秒：" + this.getName() + "已跑到" + (i * speed) + "米（" + speed + "米/秒）");
            }
        }
    }
}
