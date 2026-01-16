package com.imooc.thread;

import java.util.Random;

public class ThreadPrint {
    public static void main(String[] args) {
        ThreadPrint threadPrint = new ThreadPrint();
        threadPrint.start();
    }

    private void start() {
        Print print = new Print();
        print.start();
    }

    class Print extends Thread {
        @Override
        public void run() {
            Integer count = new Random().nextInt(10);
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("打印机正在打印" + i);
            }
        }
    }
}
