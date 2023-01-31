package pers.helen.primary;

/**
 * 13.罗马数字转整数（https://leetcode.cn/problems/roman-to-integer/）
 */
public class Demo13 {

    public static void main(String[] args){
        String s = "IV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s){
        int result = 0;
        char c = 'c';
        int valu = 0;
        if(c == 'I'){
            valu = 1;
        }else if(c == 'V'){
            valu = 5;
        }else if(c == 'X'){
            valu = 10;
        }else if(c == 'L'){
            valu = 50;
        }else if(c == 'C'){
            valu = 100;
        }else if(c == 'D'){
            valu = 500;
        }else if(c == 'M'){
            valu = 1000;
        }
        return result;
    }
}
