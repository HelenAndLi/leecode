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
        String s = "(){}}{";
        System.out.println(isValid(s));
        //        char[] c1 = new char[10];
        //        System.out.println(c1.length);
        //        System.out.println(c1[0] == ' ');
        //        System.out.println(c1[0] == 0);
    }

    public static boolean isValid(String s){
        int length = s.length();
        // 奇数个肯定不是
        if(length % 2 != 0){
            return false;
        }
        char[] c = s.toCharArray();
        char[] c1 = new char[length];
        int j = 0;
        for(int i = 0; i < length; i++){
            if(c[i] == '[' || c[i] == '(' || c[i] == '{'){
                // 加入
                c1[j] = c[i];
                j++;
            }else{
                if(c1[0] == 0 || j - 1 < 0){
                    // ] 找不到匹配的 [
                    return false;
                }
                if(c[i] == ']'){
                    if(c1[j - 1] != '['){
                        return false;
                    }
                }else if(c[i] == ')'){
                    if(c1[j - 1] != '('){
                        return false;
                    }
                }else if(c[i] == '}'){
                    if(c1[j - 1] != '{'){
                        return false;
                    }
                }else{
                    return false;
                }
                c[j - 1] = 0;
                j--;
            }
        }
        if(c[0] != 0){
            return false;
        }
        return true;
    }
}
