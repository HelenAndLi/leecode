package pers.helen.middle;

/**
 * 300. 最长递增子序列
 */
public class Middle300 {

    public static void main(String[] args){
//        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums = new int[]{0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS1(int[] nums){

        return 1;
    }

    public static int lengthOfLIS(int[] nums){

        int max = 1;
        for(int i = 0; i < nums.length - 1; i++){
            int flag = nums[i];
            int temp = 1;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] <= flag){
                    continue;
                }
                flag = nums[j];
                System.out.println("flag="+flag);
                temp++;
            }
            if(temp > max){
                max = temp;
            }
            System.out.println("========temp========"+temp);
        }
        return max;
    }
}
