package org.example.iml;

public class Test {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        XiaoYanZi xiaoYanZi = new XiaoYanZi("小燕子", 10);
        xiaoYanZi.display();
        xiaoYanZi.eat();
        xiaoYanZi.fly();
        if (xiaoYanZi instanceof Speakable) {
            Speakable f = (Speakable) xiaoYanZi;
            f.speak();
        }

        Dog dog = new Dog("狗", 20);
        dog.display();
        dog.eat();
        if (dog instanceof Flyable) {
            Flyable f = (Flyable) dog;
            f.fly();
        }
        if (dog instanceof Speakable) {
            Speakable f = (Speakable) dog;
            f.speak();
        }


        YingWu yingWu = new YingWu("鹦鹉", 33);
        yingWu.display();
        yingWu.eat();
    }
}
