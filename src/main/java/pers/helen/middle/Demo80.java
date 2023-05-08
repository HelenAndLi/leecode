package pers.helen.middle;

import java.time.Year;
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
        //                int[] nums = new int[]{1, 1, 1, 2, 2, 2, 3, 3};
        //                                int[] nums = new int[]{1, 1, 1};
        //        int[] nums = new int[]{1, 2, 2, 2};
        //                int[] nums = new int[]{0, 1, 1, 1, 2, 2, 3, 4, 4};
        //                                                        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int[] nums = new int[]{1, 1, 1, 2, 2, 2, 3, 3};
        //        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int len = removeDuplicates(nums);
        for(int i = 0; i < len; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }

    /**
     * 遍历当前元素（同一数值的第一个），如果replace！=0，即表示它代替上个元素的个数，此时用下个元素顶上（同时newReplace+），保证当前元素没有其他元素的影响，count+当前元素个数
     * 如果下个元素没了，说明当前元素是最后一个元素，那么count加上（当前元素个数-replace）即可
     *
     * @param nums
     *
     * @return
     */

    public static int removeDuplicates(int[] nums){

        int length = nums.length;

        int replace = 0;
        int all = 0;
        int j;
        // 1, 1, 1, 2, 2, 2, 3, 3
        for(int i = 0; i < length; ){
            int nextReplace = 0;

            // 下一个数值的位置
            j = i + 1;
            // 记录个数
            int count = 1;
            while(j < length && nums[i] == nums[j]){
                ++j;
                count++;
            }
            // 达到最后一个数值了
            if(j >= length){

                if(j - i - replace > 2){
                    all = all + 2;
                }else{
                    all = all + (j - i - replace);
                }
                break;
            }
            int nextVal = nums[j];
            if(replace != 0){
                // 用下一数值替代当前数值，当前数值替代了几个，下一数值就要替代几个
                for(int a = 1; a <= replace; a++){
                    nums[j - a] = nextVal;
                }

                nextReplace = replace;
                count = count - replace;
            }

            if(count > 2){
                for(int a = 0; a < count - 2; a++){
                    nums[a + i + 2] = nextVal;
                    nextReplace++;
                }
                all += 2;
                i += 2;
            }else{
                i += count;
                all += count;
            }
            replace = nextReplace;
        }
        return all;
    }
}
