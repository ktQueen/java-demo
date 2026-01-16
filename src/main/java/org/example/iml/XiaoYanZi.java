package org.example.iml;

public class XiaoYanZi extends Animal implements Flyable {
    public XiaoYanZi() {
    }

    public XiaoYanZi(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println(this.getName() + "吃玉米");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "在飞翔");
    }
}
