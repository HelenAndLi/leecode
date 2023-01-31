package pers.helen.primary;

import java.util.Arrays;

/**
 * 1.两数之和（https://leetcode.cn/problems/two-sum/）
 */
public class Demo1 {

    public static void main(String[] args){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(sum1(nums, target)));
    }

    private static int[] sum1(int[] nums, int target){
        int[] result = new int[2];
        int m = 0;
        int n = 0;
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            int another = target - nums[i];
            for(int j = 1; j < nums.length - 1; j++){
                if(i == j){
                    continue;
                }
                if(another == nums[j]){
                    m = i;
                    n = j;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(m > n){
            result[0] = n;
            result[1] = m;
        }else{
            result[0] = m;
            result[1] = n;
        }
        return result;
    }

    private static int[] sum(int[] nums, int target){

        int[] result = new int[2];
        int[] plus = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            plus[i] = target - nums[i];
        }
        boolean found = false;
        int one = 0;
        int another = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < plus.length; j++){
                if(nums[i] == target - plus[j]){
                    found = true;
                    another = plus[j];
                    break;
                }

            }
            if(found){
                one = nums[i];
                break;
            }
        }
        result[0] = one;
        result[1] = another;
        return result;
    }
}
