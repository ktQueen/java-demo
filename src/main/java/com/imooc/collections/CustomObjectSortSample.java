package com.imooc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomObjectSortSample {
    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("121212124", "商品A"));
        goodsList.add(new Goods("121212122", "商品B"));
        goodsList.add(new Goods("121212128", "商品C"));
        goodsList.add(new Goods("121212123", "商品D"));
        System.out.println("排序前");
        System.out.println(goodsList);
        System.out.println("排序后");
        System.out.println(new CustomObjectSortSample().sort(goodsList));

    }

    public List<Goods> sort(List<Goods> list) {
        CustomComparator comp = new CustomComparator();
        Collections.sort(list, comp);
        return list;
    }

    private class CustomComparator implements Comparator<Goods> {

        @Override
        public int compare(Goods o1, Goods o2) {
            return o1.getSn().compareTo(o2.getSn());
        }
    }
}
