package pers.helen.primary;

/**
 * 27.移除元素（https://leetcode.cn/problems/remove-element/）
 */
public class Demo27 {

    public static void main(String[] args){
        //                int[] nums = {4, 5};
        //                int val = 5;

        //                int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        //                int val = 2;

        //        int[] nums = {3, 3};
        //        int val = 3;

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int len = removeElement(nums, val);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
        for(int i = 0; i < len; i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();
    }

    public static int removeElement(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }
            return 1;
        }
        int len = nums.length - 1;
        // 遍历元素
        for(int i = 0; i < nums.length; i++){

            while(len > 0 && val == nums[len]){
                len--;
            }

            // 向左指针和向右指针相遇了
            if(len < i){
                break;
            }
            // 如果元素值跟flag相等
            if(nums[i] == val){
                // 把值对换
                nums[i] = nums[len--];
            }

        }
        return len + 1;
    }
}
