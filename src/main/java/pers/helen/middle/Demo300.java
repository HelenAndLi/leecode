package pers.helen.middle;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长递增子序列（https://leetcode.cn/problems/longest-increasing-subsequence/）
 */
public class Demo300 {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args){

    }

    public static int lengthOfLIS(int[] nums){
        if(nums.length < 2){
            return 1;
        }
        int[] n1 = new int[nums.length - 1];
        int[] n2 = new int[nums.length - 2];
        for(int i = 0; i < nums.length; i++){
            if(i < n1.length){
                n1[i] = nums[i];
            }
            if(i < n2.length){
                n2[i] = nums[i];
            }
        }
        return 1;
    }
}
