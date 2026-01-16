package com.imooc.list;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {

        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("三国演义");//ctrl+shift+回车 自动增加结尾分号
        bookList.add("水浒传");
        System.out.println(bookList);//快捷键：sout

        System.out.println("=====================");
        String bookName1 = bookList.get(1);
        System.out.println(bookName1);
//        bookList.get(10);
        bookList.add(1, "红楼梦");
        System.out.println(bookList);
        boolean result = bookList.add("西游记");
        System.out.println("列表是否发生变化：" + result);

        System.out.println("=====================");
        String before = bookList.set(3, "西游记后传");
        System.out.println(before);
        System.out.println(bookList);

        System.out.println("=====================");
        boolean result2 = bookList.remove("西游记后传");
        System.out.println(result2);
        System.out.println(bookList);

        System.out.println("=====================");
        String result3 = bookList.remove(0);
        System.out.println(result3);
        System.out.println(bookList);

        System.out.println("=====================");
        int count = bookList.size();
        System.out.println(count);
        bookList.set(bookList.size() - 1, "测试数据");
        bookList.remove(bookList.size() - 1);
        System.out.println(bookList);
    }
}
