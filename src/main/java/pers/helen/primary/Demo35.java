package pers.helen.primary;

/**
 * 35. 搜索插入位置（https://leetcode.cn/problems/search-insert-position/）
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 * <p>
 * <p>
 * 提示:
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 为 无重复元素 的 升序 排列数组
 * -104 <= target <= 104
 */
public class Demo35 {

    public static void main(String[] args){
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
        //        System.out.println(5 / 2); //0,1,2
        //        System.out.println(6 / 2);
    }

    public static int searchInsert(int[] nums, int target){
        return middleSearch(nums, target, 0, nums.length - 1);
    }

    /**
     * 0 1 2 3 4
     * <p>
     * 0 1 2 3 4 5 6 7 8
     * 8-0 / 2 = 4
     * 8-4 / 2 = 2
     *
     * @param nums
     * @param target
     * @param start
     * @param end
     *
     * @return
     */
    public static int middleSearch(int[] nums, int target, int start, int end){
        if(start == end){
            if(target > nums[start]){
                return start + 1;
            }
            return start;
        }
        int middle = (end - start) / 2 + start;
        if(target == nums[middle]){
            return middle;
        }else if(target > nums[middle]){
            // 后半段
            middle = middleSearch(nums, target, middle + 1, end);
        }else{
            middle = middleSearch(nums, target, start, middle);
        }
        return middle;
    }
}
