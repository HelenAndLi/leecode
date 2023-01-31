package pers.helen.primary;

/**
 * 26.删除排序数组中的重复项（https://leetcode.cn/problems/remove-duplicates-from-sorted-array/）
 */
public class Demo26 {

    public static void main(String[] args){
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = new int[]{0, 1, 2, 3, 4}; // 长度正确的期望答案

        int k = removeDuplicates(nums); // 调用

        assert k == expectedNums.length;
        for(int i = 0; i < k; i++){
            System.out.println(nums[i]);
            assert nums[i] == expectedNums[i];
        }

    }

    private static int removeDuplicates(int[] nums){
        int slow = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                // 不是重复的
                slow++;
                nums[slow] = nums[i + 1];
            }
        }
        return slow + 1;
    }
}
