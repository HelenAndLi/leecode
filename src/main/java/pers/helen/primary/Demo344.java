package pers.helen.primary;

/**
 * 344.反转字符串（https://leetcode.cn/problems/reverse-string/）
 */
public class Demo344 {

    public static void main(String[] args){
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s){
        int length = s.length;
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }
}
