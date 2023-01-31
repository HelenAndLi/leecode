package pers.helen.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * 70.爬楼梯（https://leetcode.cn/problems/climbing-stairs/）
 * 典型斐波那契数列问题：f(n) = f(n-1) + f(n-2)
 */
public class Demo70 {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args){
        System.out.println(climbStairs(45));
    }

    public static int climbStairs(int n){
        if(n <= 2){
            map.put(n, n);
            return n;
        }
        int c1;
        if(map.containsKey(n - 1)){
            c1 = map.get(n - 1);
        }else{
            c1 = climbStairs(n - 1);
            map.put(n - 1, c1);
        }

        int c2;
        if(map.containsKey(n - 2)){
            c2 = map.get(n - 2);
        }else{
            c2 = climbStairs(n - 2);
            map.put(n - 2, c2);
        }
        return c1 + c2;
    }
}
