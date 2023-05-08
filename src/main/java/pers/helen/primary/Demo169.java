package pers.helen.primary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 169.多数元素
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,2,3]
 * 输出：3
 * <p>
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 *
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 */
public class Demo169 {

    public static void main(String[] args){
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
//        int mid = nums.length / 2;
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int n : nums){
//            Integer count = map.get(n);
//            if(count == null){
//                count = 0;
//            }
//            if(count >= mid){
//                return n;
//            }
//            map.put(n, count + 1);
//        }
//        return 0;
    }
}
