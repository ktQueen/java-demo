package com.imooc.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {
    public static void main(String[] args) {
//        LinkedHashMap<String, Object> student = new LinkedHashMap<>();
        Map<String, Object> student = new LinkedHashMap<>();
        student.put("name", "张三");
        student.put("age", 18);
        student.put("height", 182);
        student.put("weight", 60);
        System.out.println(student);
    }
}
