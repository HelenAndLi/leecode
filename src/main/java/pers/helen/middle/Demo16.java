package pers.helen.middle;

/**
 * 16. 最接近的三数之和（https://leetcode.cn/problems/3sum-closest/）
 */
public class Demo16 {

    public static void main(String[] args){
        int[] nums = new int[]{4,0,5,-5,3,3,0,-4,-5};
        int target = -2;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target){
        int sum = nums[0] + nums[1] + nums[2];
        int min;
        if(sum > 0){
            if(target < 0){
                min = sum + Math.abs(target);
            }else{
                min = Math.abs(sum - target);
            }
        }else{
            if(target < 0){
                min = Math.abs(Math.abs(sum) - Math.abs(target));
            }else{
                min = Math.abs(sum) + target;
            }
        }

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int ts = nums[i] + nums[j] + nums[k];
                    int res;
                    if(ts < 0){
                        if(target < 0){
                            res = Math.abs(ts) - Math.abs(target);
                        }else{
                            res = Math.abs(ts) + target;
                        }
                    }else{
                        if(target < 0){
                            res = ts + Math.abs(target);
                        }else{
                            res = ts - target;
                        }
                    }
                    res = Math.abs(res);

                    if(res < min){
                        sum = ts;
                        min = res;
                    }
                }
            }
        }
        return sum;
    }

}
