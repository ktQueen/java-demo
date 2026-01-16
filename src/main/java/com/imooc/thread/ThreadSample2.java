package com.imooc.thread;

import java.util.Random;

public class ThreadSample2 {
    public static void main(String[] args) {
        new ThreadSample2().start();
    }

    public void start() {
        Runner runner = new Runner();
        Thread threadA = new Thread(runner);
        threadA.setName("参赛者A");
        Thread threadB = new Thread(new Runner());
        threadB.setName("参赛者B");
        Thread threadC = new Thread(new Runner());
        threadC.setName("参赛者c");
        threadA.start();
        threadB.start();
        threadC.start();
    }

    //Runnable就是用来实现多线程处理程序的
    class Runner implements Runnable {

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

                System.out.println("第" + i + "秒：" + Thread.currentThread().getName() + "已跑到" + (i * speed) + "米（" + speed + "米/秒）");
            }
        }
    }
}
