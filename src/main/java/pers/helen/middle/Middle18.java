package pers.helen.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 18.四数之和（https://leetcode.cn/problems/4sum/）
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]]
 * （若两个四元组元素一一对应，则认为两个四元组重复）：
 * <p>
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [2,2,2,2,2], target = 8
 * 输出：[[2,2,2,2]]
 */
public class Middle18 {

    public static void main(String[] args){
        //        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        //        int[] nums = new int[]{0, 0, 0, 0};
        //        int[] nums = new int[]{-2, -1, -1, 1, 1, 2, 2};
        //        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int[] nums = new int[]{1000000000, 1000000000, 1000000000, 1000000000};
        //        int target = -1;
        int target = -294967296;
        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target){
        long count = Long.valueOf(target);
        List<List<Integer>> result = new ArrayList<>();
//        if(nums.length == 4){
//            System.out.println(count);
//            for(int i : nums){
//                count -= i;
//                System.out.println(count);
//            }
//            if(count == 0){
//                List<Integer> res = new ArrayList<>();
//                res.add(nums[0]);
//                res.add(nums[1]);
//                res.add(nums[2]);
//                res.add(nums[3]);
//                result.add(res);
//            }
//            return result;
//        }
        List<Integer> list = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        System.out.println("list=" + list);
        for(int i = 0; i < list.size() - 3; i++){
            if(list.get(i)>count){
                return result;
            }
            if(i>0&&list.get(i)==list.get(i-1)){
                continue;
            }
            System.out.println("list[" + i + "]=" + list.get(i));
            for(int j = i + 1; j < list.size() - 2; j++){
                System.out.println("list[" + j + "]=" + list.get(j));
                int ij = list.get(i) + list.get(j);
                int a = j + 1;
                int b = list.size() - 1;
                while(a < b){
                    System.out.println("-> list[" + a + "]=" + list.get(a));
                    System.out.println("<- list[" + b + "]=" + list.get(b));
                    System.out.println("---");
                    long sum = Long.valueOf(ij) + Long.valueOf(list.get(a)) + Long.valueOf(list.get(b));
                    if(sum == count){
                        System.out.println("ij=" + ij);
                        List<Integer> res = new ArrayList<>();
                        res.add(list.get(i));
                        res.add(list.get(j));
                        res.add(list.get(a));
                        res.add(list.get(b));
                        if(!result.contains(res)){
                            result.add(res);
                        }

                        System.out.println("result=" + result);
                        a++;
                        b--;
                    }else if(sum < count){
                        a++;
                    }else{
                        b--;
                    }
                }
                System.out.println("===");
            }
            System.out.println("vvvvvv");
        }
        return result;
    }
}
