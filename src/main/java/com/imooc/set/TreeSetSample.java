package com.imooc.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        new TreeSetSample().sort();
    }

    public void sort() {
        //使用包装类型，通过对象的形式传日整型数据
        Set<Integer> set = new TreeSet<Integer>((Comparator<? super Integer>) new IntegerComparator());
        set.add(100);
        set.add(140);
        set.add(180);
        set.add(200);
        set.add(300);
        System.out.println(set);
    }

    //新增一个内部类
    class IntegerComparator implements Comparable<Integer> {
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }

        @Override
        public int compareTo(Integer o) {
            return 0;
        }
    }
}
