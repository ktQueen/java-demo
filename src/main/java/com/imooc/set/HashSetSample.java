package com.imooc.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new HashSet<String>();
        mobileSet.add("1331111222");
        mobileSet.add("1333444444");
        mobileSet.add("1333555555");
        boolean isChanged = mobileSet.add("1333555553");
        System.out.println("Set集合发生改变" + isChanged);
        isChanged = mobileSet.add("1333555553");
        System.out.println("Set集合发生改变" + isChanged);
        System.out.println(mobileSet);

        int count = mobileSet.size();
        boolean result = mobileSet.contains("1333555553");
        System.out.println(result);

    }
}
