package pers.helen.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 242.有效的字母异位词（https://leetcode.cn/problems/valid-anagram）
 */
public class Primary242 {

    public static void main(String[] args){
        //        String s = "egg1";
        //        String t = "gge";
        String s = "ab";
        String t = "a";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();


        int[] list = new int[26];

        for(char c : sArr){
            list[c - 'a'] = list[c - 'a'] + 1;

        }
        for(char c : tArr){
            int count = list[c - 'a'];
            if(count == 0){
                return false;
            }
            list[c - 'a'] = list[c - 'a'] - 1;
        }

        for(int c : list){
            if(c > 0){
                return false;
            }
        }
        return true;
    }
}
