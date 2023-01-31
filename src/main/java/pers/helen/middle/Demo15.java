package pers.helen.middle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 15.三数之和（https://leetcode.cn/problems/3sum/）
 */
public class Demo15 {

    public static void main(String[] args){
        //        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 2){
            return result;
        }
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                if(i == j){
                    continue;
                }
                for(int k = j + 1; k < nums.length; k++){
                    if(j == k || i == k){
                        continue;
                    }
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!result.contains(list)){
                            result.add(list);
                        }

                    }
                }
            }
        }
        return result;
    }
}
