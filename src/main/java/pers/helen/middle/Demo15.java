package pers.helen.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 15.三数之和（https://leetcode.cn/problems/3sum/）
 * <p>
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k]
 * == 0 。请
 * <p>
 * 你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 */
public class Demo15 {

    public static void main(String[] args){
        //        int[] nums = {-1, 0, 1, 2, -1, -4,-1, 0, 1, 2, -1, -4};
        //                int[] nums = {};
        //        int[] nums = {-2, 0, 1, 1, 2};
//                int[] nums = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
//        int[] nums = {-1, 1, 2, 0, -1, -4};
//                        int[] nums = {0, 0, 0, 0};
                        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        // 元素个数不足，直接返回
        if(nums.length < 3){
            return result;
        }
        // 排序
        List<Integer> list = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        int length = list.size();
        int i = 0;
        // 只遍历到倒数第三个元素
        while(i < length - 2){

            int numi = list.get(i);
            // 这是就是从当前下标为i元素的下一个元素开始向右遍历
            int toRight = i + 1;
            // 这里是从列表最后一个元素开始向左遍历
            int toLeft = length - 1;
            // 两个元素遍历不断靠近，但不让他们相遇甚至是擦肩而过
            while(toLeft > toRight){
                int numToRight = list.get(toRight);
                int numToLeft = list.get(toLeft);
                int sum = numToRight + numToLeft + numi;
                // 三者之和大于0，说明最大的那个元素（也就是toLeft）太大了，要再往前走走，找个小点的
                if(sum > 0){
                    toLeft--;
                }else if(sum < 0){
                    // 三者之和小于0，说明较小的那个元素（也就是toLeft）太小了，要再往后继续走走，找个大点的
                    toRight++;
                }else{
                    result.add(Arrays.asList(new Integer[]{numi, numToRight, numToLeft}));
                    while(numToLeft == list.get(--toLeft) && toLeft > toRight){
                        // 这里是为了去重，往左（即往前）遍历的那个下标，如果在当前轮已经用来判断过了，就没必要再走一遍流程了，要注意也要遵循不跟另一个方向来的指针相遇
                    }
                    while(numToRight == list.get(++toRight) && toLeft > toRight){
                        // 同上
                    }
                }
            }
            while(i < length - 1 && numi == list.get(++i)){
                // 这里也是为了去重，如果某一数值已经用来走过流程了，就没必要再走了，直接跳过，也要注意越界问题
                continue;
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSum1(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 2){
            return result;
        }
        List<String> found = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                if(i == j){
                    continue;
                }
                int iAndJ = nums[i] + nums[j];

                for(int k = j + 1; k < nums.length; k++){
                    if(iAndJ + nums[k] == 0){
                        int ni = nums[i];
                        int nj = nums[j];
                        int nk = nums[k];
                        String temp;
                        if(ni >= nj && ni >= nk){
                            if(nj > nk){
                                temp = ni + "," + nj + "," + nk;
                            }else{
                                temp = ni + "," + nk + "," + nj;
                            }
                        }else if(nj >= ni && nj >= nk){
                            if(ni >= nk){
                                temp = nj + "," + ni + "," + nk;
                            }else{
                                temp = nj + "," + nk + "," + ni;
                            }
                        }else{
                            if(ni >= nj){
                                temp = nk + "," + ni + "," + nj;
                            }else{
                                temp = nk + "," + nj + "," + ni;
                            }
                        }

                        if(!found.contains(temp)){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            Collections.sort(list);
                            result.add(list);
                            found.add(temp);

                            List<String> l = Arrays.stream(temp.split(",")).toList();
                            l.stream().map(s->Integer.parseInt(s));
                        }

                    }
                }
            }
        }
        return result;
    }
}
