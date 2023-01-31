package pers.helen.primary;

/**
 * 70.最大子数组和（https://leetcode.cn/problems/maximum-subarray/）
 */
public class Demo53 {

    public static void main(String[] args){
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums){
        int sum = 0;
        int length = nums.length;

        int start = 0;
        int end = 0;
        for(int i = 0; i < length - 1; i++){
            int max = 0;
            int t = nums[i];

            for(int j = i; j < length; j++){
                if(t + nums[j] > t){
                    start = i;
                    end = j;
                    max += t;
                }
                t += nums[j];
            }
            if(max > sum){
                sum = max;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return sum;
    }
}
