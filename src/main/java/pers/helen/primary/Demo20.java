package pers.helen.primary;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 20.有效的括号（https://leetcode.cn/problems/valid-parentheses/）
 * 左的下一位，要么是自己的右，要么是左
 * 自己的右一定在奇数位上
 * 从最后一个左开始匹配
 */
public class Demo20 {

    public static void main(String[] args){
        // s 仅由括号 '()[]{}' 组成：()，()[]{}，(]，([)]，{[]}，[{([])}]
        //        String s = "[(])";
        //        String s = "()[]{}";
        //                String s = "(]";
        //                String s = "([)]";
        //                String s = "([[])]";
        //        String s = "{[]}";
        //                        String s = "({[)";
        String s = "(([]){})";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        int length = s.length();
        if(length % 2 != 0){
            return false;
        }
        char[] c = s.toCharArray();
        Map<String, Integer> left = new TreeMap<>();
        Map<Integer, Character> right = new TreeMap<>();
        for(int i = 0; i < length; i++){
            if(c[i] == '[' || c[i] == '{' || c[i] == '('){
                left.put(c[i] + "" + i, i);
            }else{
                right.put(i, c[i]);
            }
        }
        if(left.size() != right.size()){
            return false;
        }
        Map<Character, Character> rules = new HashMap<>();
        rules.put('[', ']');
        rules.put('{', '}');
        rules.put('(', ')');
        for(Map.Entry<String, Integer> map : left.entrySet()){
            char key = map.getKey().toCharArray()[0];
            int value = map.getValue();
            int find = s.indexOf(rules.get(key), value);
            if(find > value){
                // 找到了
                // 判断是否合法
                if((find - value) % 2 != 0){
                    right.remove(find);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;
    }
}
