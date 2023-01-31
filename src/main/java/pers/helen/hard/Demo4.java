package pers.helen.hard;

import java.util.logging.Level;

/**
 * 4.寻找两个正序数组的中位数（https://leetcode.cn/problems/median-of-two-sorted-arrays/）
 */
public class Demo4 {

    public static void main(String[] args){
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){

        int length = nums1.length + nums2.length;
        boolean odd = false;
        if(length % 2 == 0){
            odd = true;
        }
        length = length / 2 + 1;
        int[] contact = new int[length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(k < length){

            while(i < nums1.length){
                if(j < nums2.length && (nums1[i] > nums2[j])){
                    break;
                }else if(k < length){
                    contact[k] = nums1[i];
                    i++;
                    k++;
                }else{
                    break;
                }
            }

            while(j < nums2.length){
                if(i < nums1.length && (nums2[j] > nums1[i])){
                    break;
                }else if(k < length){
                    contact[k] = nums2[j];
                    j++;
                    k++;
                }else{
                    break;
                }
            }

        }

        if(odd){
            return ((double) contact[length - 1] + (double)contact[length - 2]) / 2;
        }else{
            return contact[length - 1];
        }

    }
}
