package org.example.string;

/*
 * 获取指定字符串中大写字母、小写字母、数字的个数
 * */
public class StringTest04 {
    public static void main(String[] args) {
        String s = "sddfffwer4sdfdsfsdfswew";
        char[] chars = s.toCharArray();
        System.out.println(chars);

        //定义计数器
        int bigCount = 0, smallCount = 0, numCount = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c < '9') {
                numCount++;
            }
        }

        System.out.println("大写字母个数：" + bigCount);
        System.out.println("小写字母个数：" + smallCount);
        System.out.println("数字个数：" + numCount);
    }
}
