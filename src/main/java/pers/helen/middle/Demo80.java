package pers.helen.middle;

import java.util.Arrays;

/**
 * 80.删除有序数组中的重复项 II
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * <p>
 * <p>
 * 说明：
 * <p>
 * 为什么返回数值是整数，但输出的答案是数组呢？
 * <p>
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * <p>
 * 你可以想象内部操作如下:
 * <p>
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 * <p>
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 * <p>
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 不需要考虑数组中超出新长度后面的元素。
 */
public class Demo80 {

    public static void main(String[] args){
        //        int[] nums = new int[]{0, 1, 1, 1, 2, 2, 3, 4, 4};
        //                                        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    /**
     * 1、当前数值出现几次 （count-replace），有可能代替了前面的数值
     * - 不超过2次，直接保留（count-replace）个，其余的用下一个数值替代（replace），从当前位置开始遍历下一个数值
     * - 超过2次，只保留2个，用下一个数值代替，并记录代替了几个（replace）
     *
     * @param nums
     *
     * @return
     */

    public static int removeDuplicates(int[] nums){

        int length = nums.length;

        int replace = 0;
        int all = 0;

        for(int i = 0; i < length; ){
            System.out.println("nums[]=" + Arrays.toString(nums));
            System.out.println("all=" + all);
            System.out.println("i=" + i);
            int j = i + 1;
            // 记录个数
            int count = 1;
            while(j < length && nums[i] == nums[j]){
                ++j;
                count++;
            }

            if(j >= length){
                all += (count - replace);
                break;
            }
            System.out.println("j=" + j);
            System.out.println("num=" + nums[i] + ", count=" + count + ", replace=" + replace);
            if(replace > 0){
                all += (count - replace);
                for(int a = i + (count - replace); a < j; a++){
                    nums[a] = nums[j];
                }
                replace = j - (i + (count - replace));
                i = i + (count - replace);

            }else{

                all += count;
                if(j - i > 2){

                    // 超过两个
                    for(int a = i + 2; a < j; a++){
                        nums[a] = nums[j];
                    }
                    replace = j - i - 2;
                    i += 3;

                }else{
                    i += count;

                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return all;
    }
}
