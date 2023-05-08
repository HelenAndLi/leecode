package pers.helen.middle;

import java.util.Arrays;

/**
 * 189.轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 1,2,3,4,5,6,7,8,9,10,11  k=8
 * 4,5,6,7,8,9,10,11,1,2,3
 * <p>
 * 1,2,3,4,5,6,7,8,9,10,11  k=3
 * 9, 10, 11, 1, 2, 3, 4, 5, 6, 7, 8
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 */
public class Demo189 {

    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int k = 3;
        //        int[] nums = new int[]{-1};
        //        int k = 2;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k){
        /** 方法1 start **/
        //        int length = nums.length;
        //        if(k>=length){
        //            k= k%length;
        //        }
        //        int[] temp = new int[k];
        //
        //        int j = k;
        //        for(int i = 1; i <= k; i++){
        //            temp[--j] = nums[length - i];
        //        }
        //        for(int m = length - k-1; m > -1; m--){
        //            nums[--length] = nums[m];
        //        }
        //        for(int i = 0;i<k;i++){
        //            nums[i] = temp[i];
        //        }
        /** 方法1 end **/
        /** 方法2 start **/


        int length = nums.length;
        if(k >= length){
            k = k % length;
        }
        int[] a = Arrays.copyOfRange(nums, 0, length - k);
        int[] b = Arrays.copyOfRange(nums, length - k, length);
        System.arraycopy(b, 0, nums, 0, b.length);
        System.arraycopy(a, 0, nums, b.length, a.length);
        /** 方法2 end **/
    }
}
