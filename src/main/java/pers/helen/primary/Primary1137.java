package pers.helen.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * 1137. 第 N 个泰波那契数(https://leetcode.cn/problems/n-th-tribonacci-number)
 * 泰波那契序列 Tn 定义如下：
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下
 * Tn+3 = Tn + Tn+1 + Tn+2
 * n=0, T3 = T0+T1+T2
 * n=1, T4 = T1+T2+T3 = T1+T2+(T1+T2) = 2*(T1+T2)
 * n=2, T5 = T2+T3+T4 = T2+(T1+T2)+2*(T1+T2) = 3*(T1+T2)+T2
 * n=3, T6 = T3+T4+T5 = (T1+T2) + 2*(T1+T2) + 3*(T1+T2)+T2 = 6*(T1+T2)+T2
 * n=4, T7 = T4+T5+T6 = 2*(T1+T2) + 3*(T1+T2)+T2 + 6*(T1+T2)+T2= 11*(T1+T2) + 2*T2
 *
 * <p>
 * Tn = T(n-3) + T(n-2) + T(n-1)
 *
 * <p>
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * 示例 2：
 * <p>
 * 输入：n = 25
 * 输出：1389537
 */
public class Primary1137 {

    public static void main(String[] args){
        System.out.println(tribonacci(35));
    }


    private static Map<Integer, Integer> map = new HashMap<>();

    public static int tribonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }

        int s3 = 0;
        if(map.containsKey(n - 3)){
            s3 = map.get(n - 3);
        }else{
            s3 = tribonacci(n - 3);
        }
        int s2 = 0;
        if(map.containsKey(n - 2)){
            s2 = map.get(n - 2);
        }else{
            s2 = tribonacci(n - 2);
        }
        int s1 = 0;
        if(map.containsKey(n - 1)){
            s1 = map.get(n - 1);
        }else{
            s1 = tribonacci(n - 1);
        }

        int sum = s3 + s2 + s1;
        map.put(n, sum);
        return sum;
    }
}
