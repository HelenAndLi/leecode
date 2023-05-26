package pers.helen.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 205. 同构字符串
 */
public class Primary205 {

    public static void main(String[] args){
        String s = "egg";
        String t = "abb";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t){
        int lengthS = s.length();
        int lengthT = t.length();
        if(lengthS != lengthT){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        List<Character> use = new ArrayList<>();
        for(int i = 0; i < lengthS; i++){
            Character c = map.get(arr1[i]);
            if(c == null){
                if(use.contains(arr2[i])){
                    return false;
                }
                map.put(arr1[i], arr2[i]);
                use.add(arr2[i]);
            }else{
                if(c != arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
