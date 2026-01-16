package com.imooc.thread;

import java.util.Random;

public class ThreadAnimal {
    public static void main(String[] args) {
        ThreadAnimal threadAnimal = new ThreadAnimal();
        threadAnimal.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("main thread");
        }
    }

    public void start() {
        Animal animal = new Animal();
        Thread cat = new Thread(animal);
        cat.setName("cat");
        Thread dog = new Thread(new Animal());
        dog.setName("dog");
        cat.start();
        dog.start();
    }

    class Animal implements Runnable {
        @Override
        public void run() {
            Integer count = new Random().nextInt(3);
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("A" + Thread.currentThread().getName());
            }
        }
    }
}
