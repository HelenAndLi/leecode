package pers.helen.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 290. 单词规律
 */
public class Primary290 {

    public static void main(String[] args){
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s){
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        char[] cArr = pattern.toCharArray();
        if(cArr.length != arr.length){
            return false;
        }
        Set<String> use = new HashSet<>();
        for(int i = 0; i < cArr.length; i++){
            String c = map.get(cArr[i]);
            if(c == null){
                if(use.contains(arr[i])){
                    return false;
                }
                map.put(cArr[i], arr[i]);
                use.add(arr[i]);
            }else{
                if(!c.equals(arr[i])){
                    return false;
                }

            }

        }
        return true;
    }
}
