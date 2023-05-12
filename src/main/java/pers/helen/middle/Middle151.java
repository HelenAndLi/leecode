package pers.helen.middle;

/**
 * 151. 反转字符串中的单词(https://leetcode.cn/problems/reverse-words-in-a-string)
 */
public class Middle151 {

    public static void main(String[] args){
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i = arr.length - 1; i > -1; i--){
            if(arr[i].length() == 0){
                continue;
            }
            if(i != arr.length - 1){
                sb.append(" ");
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
