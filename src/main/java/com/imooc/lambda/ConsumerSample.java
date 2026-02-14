package com.imooc.lambda;

/*
 * Consumer接口的使用
 * */

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        output(s -> System.out.println("向控制台打印" + s));
        output(s -> {
            System.out.println("向**网站发送数据包：" + s);
        });
    }

    public static void output(Consumer<String> consumer) {
        String text = "天将降大任于是人也";
        consumer.accept(text);
    }
}
