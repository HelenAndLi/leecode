package pers.helen.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 49. 字母异位词分组(https://leetcode.cn/problems/group-anagrams)
 *
 */
public class Middle49 {

    public static void main(String[] args){
//        String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] str = new String[]{"a"};
        System.out.println(groupAnagrams(str));
        System.out.println(2358/10);
        System.out.println(2358/100);
        System.out.println(2358/1000);
        System.out.println(2358/10000);
        System.out.println("=====");
        System.out.println(7%Math.pow(10, 1));
        System.out.println((7%Math.pow(10, 1)-7%Math.pow(10, 0)));
        System.out.println(19%Math.pow(10, 1));
        System.out.println(198%Math.pow(10, 2));
        System.out.println((398%Math.pow(10, 3) -398%Math.pow(10, 2))/Math.pow(10,2));
//        System.out.println(2358%1000);
//        System.out.println(2358%10000);
//        System.out.println(2358%100000);
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sort = String.valueOf(arr);
            List<String> contains = map.get(sort);
            if(contains == null){
                contains = new ArrayList<>();
            }
            contains.add(s);
            map.put(sort, contains);
        }

        for(Map.Entry<String, List<String>> m:map.entrySet()){
            result.add(m.getValue());
        }
        return result;
    }

}
