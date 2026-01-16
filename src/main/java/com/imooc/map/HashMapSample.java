package com.imooc.map;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, Object> student = new HashMap<>();
        student.put("name", "张三");
        String name = (String) student.put("name", "李四");
        System.out.println(name + "已被替换成李四");
        System.out.println(student);
        student.put("age", 18);
        student.put("height", 182);
        student.put("weight", 60);
        System.out.println(student);

        String n = (String) student.get("name");
        System.out.println(n);

        boolean r1 = student.containsKey("name");
        System.out.println(r1);

        boolean r2 = student.containsValue(61);
        System.out.println(r2);

        int count = student.size();
        System.out.println(count);

        Integer w = (Integer) student.remove("weight");
        System.out.println("weight项已被移除，其值为：" + w);
        System.out.println(student);

    }
}
