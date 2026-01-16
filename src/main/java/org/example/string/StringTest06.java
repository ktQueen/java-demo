package org.example.string;

/*获取字符串再整个字符串中出现的次数*/
public class StringTest06 {
    public static void main(String[] args) {
        String s1 = "djavafsdfsdfsdfsdfsdfserjava";
        int index = 0;
        int count = 0;
        while ((index = s1.indexOf("java")) != -1) {
            s1 = s1.substring(index + 1);
            count++;
        }
        System.out.println(count);
    }
}
