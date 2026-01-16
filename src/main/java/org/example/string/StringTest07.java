package org.example.string;

public class StringTest07 {
    public static void main(String[] args) {
        //身份证号
        String idCard = "111111199012111234";
        //获取生日
        String birth = idCard.substring(6, 14);
        System.out.println("生日：" + birth);
        //获取性别
        //0-->48
        //1-->49
        //2-->50
        char c = idCard.charAt(16);
        System.out.println(c % 2 == 0 ? "女" : "男");
    }
}
