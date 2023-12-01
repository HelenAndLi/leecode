package pers.helen.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * 202.快乐数(https://leetcode.cn/problems/happy-number)
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」 定义为：
 * <p>
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 */
public class Primary202 {



    public static void main(String[] args){

                System.out.println(isHappy(19));
        //                System.out.println(isHappy(5));
        //        System.out.println(isHappy(7));
//        System.out.println(isHappy1(2147483647));//false
        //        System.out.println(isHappy(1563712132));
        //        System.out.println(Integer.MAX_VALUE);
    }

    public static boolean isHappy(int n){
        if(n == 1){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while(!list.contains(n)){
            String[] arr = (n+"").split("");
            int sum = 0;
            for(String a:arr){
                sum+=Math.pow(Integer.valueOf(a), 2);
            }
            if(sum==1){
                return true;
            }
            list.add(n);
            n = sum;
        }
        return false;

    }
}
