package pers.helen.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成（https://leetcode.cn/problems/generate-parentheses/）
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：["()"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 8
 */
public class Demo22 {

    public static void main(String[] args){
        // 判断有效性
        /**
         * 1、左括号跟右括号个数相等
         * 2、第一个不可能是)，最后一个不可能是(
         * (())
         * ()()
         * 递归
         *
         *
         * ，
         * 
         * ()
         * ()(),             (())
         * ()()(),  ()(()),  (())(),           ((())),
         *
         * 0个：(((())))
         * 1个：()()()(),()(())(),()((())),
         * 2个：(())(()),(())()(),((()))(),
         * 当n，有1个()，后面的可能性
         */
    }

    public static List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        if(n == 1){
            result.add("()");
            return result;
        }

        return result;
    }
}
