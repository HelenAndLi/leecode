package pers.helen.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. 存在重复元素 II(https://leetcode.cn/problems/contains-duplicate-ii)
 * 给你一个整数数组 nums 和一个整数 k ，
 * 判断数组中是否存在两个 不同的索引 i 和 j ，
 * 满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 */
public class Primary219 {

    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3, 1};
        //        int[] nums = new int[]{2,2};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k){
        int length = nums.length;
        if(length == 1 || k == 0){
            return false;
        }
        for(int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < i + k + 1; j++){
                if(j >= length){
                    break;
                }
                if(nums[i] != nums[j]){
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k){
        int length = nums.length;
        if(length == 1 || k == 0){
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < length; i++){
            Integer exist = map.get(nums[i]);
            if(exist != null){
                if(i - exist <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
