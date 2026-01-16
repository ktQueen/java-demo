package org.example.iml;

public class YingWu extends Animal implements Flyable, Speakable {
    public YingWu() {
    }

    public YingWu(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "吃虫子");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "飞翔在空中");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + "在说话");
    }
}
