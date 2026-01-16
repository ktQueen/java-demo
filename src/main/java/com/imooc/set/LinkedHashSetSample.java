package com.imooc.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new LinkedHashSet<String>();
        mobileSet.add("13311112222");
        mobileSet.add("13311113333");
        mobileSet.add("13311114444");
        mobileSet.add("13311115555");
        System.out.println(mobileSet);
    }
}
