package com.imooc.lambda;

public class LambdaSample {
    public static void main(String[] args) {
        MathOperation cheng = (Integer a, Integer b) -> (float) (a / b);
        System.out.println(cheng.operate(6, 3));
    }
}
