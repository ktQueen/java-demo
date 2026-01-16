package org.example.string;

/*
 * 字符串反转
 * */
public class StringTest05 {
    public static void main(String[] args) {
        String s = "hello";
        String newStr = reverse(s);
        System.out.println(s + "反转后的结果：" + newStr);
    }

    private static String reverse(String s) {
        //将s转换成char数组，然后将数组反转，然后返回String
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            //chars[i]
            //chars[chars.length-1-i]
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);
    }
}
