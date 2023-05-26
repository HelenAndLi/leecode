package pers.helen.middle;

/**
 * 209. 长度最小的子数组(https://leetcode.cn/problems/minimum-size-subarray-sum)
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 示例 2：
 * <p>
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 */
public class Middle209 {

    public static void main(String[] args){
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    public static int minSubArrayLen(int target, int[] nums){
        int min = 0;
        for(int i = 0; i < nums.length; ){
            int sum = nums[i];
            if(sum >= target){
                return 1;
            }
            int j = i + 1;
            for(; j < nums.length; j++){
                sum += nums[j];
                if(sum >= target){
                    System.out.println("i=" + i + ",j=" + j);
                    if(min == 0){
                        min = j - i + 1;
                    }else if(j - i < min){
                        min = j - i + 1;
                    }
                    break;
                }
            }

            if(j - i > 1){
                i = j - 1;
            }else{
                i = j;
            }

        }
        return min;
    }
}
