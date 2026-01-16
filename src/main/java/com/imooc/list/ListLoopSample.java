package com.imooc.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListLoopSample {
    public static void main(String[] args) {
        //无论是ArrayList还是LinkedList都实现了List 接口，所以大多数情况下我们前面赋值的接口可以简化成List，因为所有的List都实现了List接口
        List<String> bookList = new ArrayList<String>();
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add("西游记");
        bookList.add("红楼梦");

        for (String book : bookList) {
            System.out.println(book);
        }

        bookList.forEach(book -> {
            System.out.println(book);
        });

        Iterator<String> itr = bookList.iterator();
        //hasNext进行判断是否还有元素
        while (itr.hasNext()) {
            String book = itr.next();//提取出下一个元素，同时将指针向后移动
            System.out.println(book);
        }
    }
}
