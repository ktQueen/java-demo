package com.imooc.test;

//import com.imooc.model.Man;

import com.imooc.model.Person;
//import com.imooc.model.Woman;


public class PeopleTest {
    public static void main(String[] args) {
        PeopleTest test = new PeopleTest();
//        Man one = new Man();
//        Woman two = new Woman();
//        test.getRead(one);
//        test.getRead(two);

        //方案3:匿名内部类
        /*
         * 1.匿名内部类没有类型名称、实例对象名称
         * 2.编译后的文件命名：外部类$数字.class
         * 3.无法使用private、public、protected、abstract、static修饰
         * 4.无法编写构造方法，可以添加构造代码块
         * 5.不能出现静态成员
         * 6.匿名内部类可以实现接口也可以继承父类，但是不可兼得
         * */
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("男生喜欢看科幻类书籍");
            }
        });
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("女生喜欢读言情小说");
            }
        });
    }

    //根据传入的不同的人的类型，调用对应的read方法
    //方案1:
//    public void getRead(Man man) {
//        man.read();
//    }
//
//    public void getRead(Woman woman) {
//        woman.read();
//    }

    //方案2:
    public void getRead(Person person) {
        person.read();
    }
}
