package com.imooc.thread;

public class SyncSample {
    public static void main(String[] args) {
        SyncSample sample = new SyncSample();
        sample.start();

    }

    public void start() {
        Printer printer = new Printer();
        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask();
            task.printer = printer;
            Thread thread = new Thread(task);
            thread.start();
        }
//        printer.print();
    }

    class PrintTask implements Runnable {
        public Printer printer;

        @Override
        public void run() {
            printer.print2();
        }
    }

    class Printer {
        Object lock = new Object();

        public static synchronized void print3() {
            try {
                Thread.sleep(500);
                System.out.print("魅1");
                Thread.sleep(500);
                System.out.print("魅2");
                Thread.sleep(500);
                System.out.print("魅3");
                Thread.sleep(500);
                System.out.print("魅4");
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void print1() {
            synchronized (lock) {
                try {
                    Thread.sleep(500);
                    System.out.print("魅1");
                    Thread.sleep(500);
                    System.out.print("魅2");
                    Thread.sleep(500);
                    System.out.print("魅3");
                    Thread.sleep(500);
                    System.out.print("魅4");
                    System.out.println();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void print2() {
            try {
                //this
                Thread.sleep(500);
                System.out.print("魅1");
                Thread.sleep(500);
                System.out.print("魅2");
                Thread.sleep(500);
                System.out.print("魅3");
                Thread.sleep(500);
                System.out.print("魅4");
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
