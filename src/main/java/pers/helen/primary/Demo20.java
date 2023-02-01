package pers.helen.primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
                        String s = "([)]";
//                        String s = "([[])]";
//                String s = "{[]}";
//                                String s = "({[)";
//        String s = "(([]){})";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        int length = s.length();
        // 奇数个肯定不是
        if(length % 2 != 0){
            return false;
        }
        char[] c = s.toCharArray();

        // 记录各个符号出现的下标
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        List<Integer> r3 = new ArrayList<>();
        for(int i = 0; i < length; i++){
            if(c[i] == '['){
                l1.add(i);
            }else if(c[i] == '{'){
                l2.add(i);
            }else if(c[i] == '('){
                l3.add(i);
            }else if(c[i] == ']'){
                r1.add(i);
            }else if(c[i] == '}'){
                r2.add(i);
            }else if(c[i] == ')'){
                r3.add(i);
            }
        }

        // 同组合符号个数不匹配
        if((l1.size() != r1.size()) || (l2.size() != r2.size()) || (l3.size() != r3.size())){
            return false;
        }

        for(int i = l1.size() - 1; i >= 0; i--){
            int l = l1.get(i);
            int r = r1.get(l1.size() - 1 - i);
            if(l > r){
                return false;
            }
            if((r - l) % 2 == 0){
                // 两者距离是偶数，不可能
                return false;
            }
        }
        for(int i = l2.size() - 1; i >= 0; i--){
            int l = l2.get(i);
            int r = r2.get(l2.size() - 1 - i);
            if(l > r){
                return false;
            }
            if((r - l) % 2 == 0){
                // 两者距离是偶数，不可能
                return false;
            }
        }
        for(int i = l3.size() - 1; i >= 0; i--){
            int l = l3.get(i);
            int r = r3.get(l3.size() - 1 - i);
            if(l > r){
                return false;
            }
            if((r - l) % 2 == 0){
                // 两者距离是偶数，不可能
                return false;
            }
        }

        return true;
    }
}
