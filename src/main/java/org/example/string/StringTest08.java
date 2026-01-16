package org.example.string;

/*获取两个字符串中最大相同的子字符串
 * 字符串1
 * 字符串2
 * */
public class StringTest08 {
    public static void main(String[] args) {
        String s1 = "fsdfsfersdfdsfwadsfsdf";
        String s2 = "fsdfskjkdfsdf";
        String maxSubstring = getMaxSubstring(s1, s2);
        System.out.println(maxSubstring);
    }

    private static String getMaxSubstring(String s1, String s2) {

        //记录下来连个字符串的长度
        int n1 = s1.length();
        int n2 = s2.length();

        //把最大相同的子字符串的长度记录下俩 maxlen
        //把最大相同的子字符串的起始位置记录下来 start
        int maxlen = 0;
        int start = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                //k变量是用来记录 相同子字符串的长度
                int k = 0;
                while (i + k < n1 && j + k < n2 && s1.charAt(i + k) == s2.charAt(j + k)) {
                    k++;
                }
                if (k > maxlen) {
                    maxlen = k;
                    start = i;
                }
            }
        }

        return s1.substring(start, start + maxlen);
    }
}
