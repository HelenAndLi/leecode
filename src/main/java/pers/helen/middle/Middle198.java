package pers.helen.middle;

/**
 * 198. 打家劫舍
 */
public class Middle198 {

    public static void main(String[] args){
        int[] nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums){
        int s1 = 0;
        int s2 = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                s1+=nums[i];
            }else{
                s2+=nums[i];
            }
        }
        return s1 >= s2 ? s1 : s2;
    }
}
