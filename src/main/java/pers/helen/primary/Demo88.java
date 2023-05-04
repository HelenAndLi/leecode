package pers.helen.primary;

import java.util.Arrays;

/**
 * 88.合并两个有序的数组
 */
public class Demo88 {

    public static void main(String[] args){
        //        int[] nums1 = new int[]{1, 4, 6, 7, 9, 0, 0, 0};
        //        int[] nums2 = new int[]{3, 10, 11};
        //        int m = 5;
        //        int n = 3;

        //                int[] nums1 = new int[]{0};
        //                int[] nums2 = new int[]{1};
        //                int m = 0;
        //                int n = 1;


        //        int[] nums1 = new int[]{2, 0};
        //        int[] nums2 = new int[]{1};
        //        int m = 1;
        //        int n = 1;

//        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
//        int[] nums2 = new int[]{1, 2, 3};
//        int m = 3;
//        int n = 3;

                int[] nums1 = new int[]{0,0,3,0,0,0,0,0,0};
                int[] nums2 = new int[]{-1,1,1,1,2,3};
                int m = 3;
                int n = 6;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int k = m + n - 1;
        int nPlus = n - 1;
        if(m == 0){
            m++;
        }
        for(int i = m - 1; i > -1; i--){
            for(int j = nPlus; j > -1; ){
                System.out.println("num1[" + i + "]=" + nums1[i] + ", num2[" + j + "]=" + nums2[j]);
                if(nums1[i] > nums2[j]){
                    nums1[k--] = nums1[i];
                    nums1[i] = 0;
                    System.out.println("1.nums1 = " + Arrays.toString(nums1));
                    break;
                }else{
                    nums1[k--] = nums2[j];
                    nums2[j] = 0;
                    j--;
                    nPlus--;
                    System.out.println("2.nums1 = " + Arrays.toString(nums1));
                }
            }
        }
        if( nums2.length > 0 && nPlus > -1){
            int i = 0;
            while(i <= nPlus){
                nums1[i] = nums2[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
