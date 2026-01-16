package com.imooc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(90);
        list.add(30);
        list.add(50);
        System.out.println(list);
        ListSorter listSorter = new ListSorter();
        List<Integer> list1 = listSorter.sort(list);
        System.out.println(list1);
    }

    public List<Integer> sort(List<Integer> list) {
        Collections.sort(list, new SampleComparator());
        System.out.println(list);
        return list;
    }

    class SampleComparator implements Comparator<Integer> {

        //结果>0,则交换位置
        //结果=0或小于0，则位置不变
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
