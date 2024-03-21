package pers.helen.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 17.电话号码的字母组合（https://leetcode.cn/problems/letter-combinations-of-a-phone-number/）
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 示例 1：
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 * <p>
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 */
public class Demo17 {

    public static void main(String[] args){
        System.out.println(letterCombinations("233"));
    }

    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if(digits.length() < 1){
            return result;
        }
        String[] strings = digits.split("");
        List<char[]> list = new ArrayList<>();
        for(String str : strings){
            char[] chars = getChars(Integer.valueOf(str));
            list.add(chars);
        }
        for(char c : list.get(0)){
            result.add(c + "");
        }
        for(int i = 1; i < list.size(); i++){
            char[] chars = list.get(i);
            List<String> temp = new ArrayList<>();
            for(char c : chars){
                for(String s : result){
                    s += c;
                    temp.add(s);
                }
            }
            result = temp;
        }

        return result;
    }

    public static char[] getChars(int digit){
        char[] chars = null;
        switch(digit){
            case 2:
                chars = "abc".toCharArray();
                break;
            case 3:
                chars = "def".toCharArray();
                break;
            case 4:
                chars = "ghi".toCharArray();
                break;
            case 5:
                chars = "jkl".toCharArray();
                break;
            case 6:
                chars = "mno".toCharArray();
                break;
            case 7:
                chars = "pqrs".toCharArray();
                break;
            case 8:
                chars = "tuv".toCharArray();
                break;
            case 9:
                chars = "wxyz".toCharArray();
                break;
        }
        return chars;
    }
}
