package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopSample {
    public static void main(String[] args) {
        Map<String, Object> student = new HashMap<>();
        student.put("name", "张三");
        student.put("age", 18);
        student.put("height", 182);
        student.put("weight", 60);
        System.out.println(student);
        LoopSample loopSample = new LoopSample();
        loopSample.doForLoop(student);
        loopSample.doForEach(student);
        loopSample.doIterator(student);
    }

    public void doIterator(Map map) {
        Iterator<Map.Entry<String, Object>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Object> entry = itr.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void doForEach(Map map) {
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }

    public void doForLoop(Map map) {
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + ":" + map.get(k));
        }
    }
}
