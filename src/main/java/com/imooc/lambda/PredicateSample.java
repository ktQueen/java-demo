package com.imooc.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n > 4;
        boolean result = predicate.test(10);
        System.out.println(result);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        for (Integer num : list) {
//            if (num % 2 == 1) {
//                System.out.println(num);
//            }
//        }
        filter(list, n -> n % 2 == 1);
        filter(list, n -> n % 2 == 0);
        filter(list, n -> n > 5 && n % 2 == 0);
        List<String> list2 = Arrays.asList("java", "python", "php", "HTML");
        filter2(list2, n -> n.contains("a"));
    }

    public static void filter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer num : list) {
            if (predicate.test(num)) {
                System.out.print(num + "");
            }
        }
        System.out.println("");
    }

    public static void filter2(List<String> list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.print(str + "");
            }
        }
        System.out.println("");
    }
}
