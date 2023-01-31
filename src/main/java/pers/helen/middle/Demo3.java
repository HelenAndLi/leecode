package pers.helen.middle;

import java.util.Arrays;
import java.util.List;

/**
 * 3.无重复字符的最长子串（https://leetcode.cn/problems/longest-substring-without-repeating-characters/）
 */
public class Demo3 {

    public static void main(String[] args){
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        char[] chars = s.toCharArray();
        int max = 1;

        int length = s.length();
        int j = 1;
        for(int i = 0; i < length - 1; i++){

            StringBuilder sb = new StringBuilder();
            sb.append(chars[i]);

            for(; j < length; j++){
                if(sb.toString().contains(String.valueOf(chars[j]))){
                    if(max < sb.length()){
                        max = sb.length();
                    }
                    break;
                }else{
                    sb.append(chars[j]);
                    if(max < sb.length()){
                        max = sb.length();
                    }
                }
            }
        }

        return max;
    }

}
