package pers.helen.primary;

/**
 * 66.加1(https://leetcode.cn/problems/plus-one/)
 */

public class Demo66 {

    public static void main(String[] args){
        //        int[] digits = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4,
        //                7, 4, 9,
        //                4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 9};
        int[] digits = new int[]{9, 9};
        digits = change1(digits);
        for(int i = 0; i < digits.length; i++){
            System.out.print(digits[i] + ",");
        }

        System.out.println();
    }

    public static int[] change1(int[] digits){
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 0;
        for(int i = 0; i < digits.length; i++){
            newDigits[i + 1] = digits[i];
        }
        newDigits[newDigits.length - 1] = newDigits[newDigits.length - 1] + 1;
        boolean add = false;
        for(int i = newDigits.length - 1; i >= 0; i--){
            if(add){
                newDigits[i] = newDigits[i] + 1;
                add = false;
            }
            if(newDigits[i] > 9){
                newDigits[i] = 0;
                add = true;
            }
        }
        if(newDigits[0] != 0){
            return newDigits;
        }
        for(int i = 1; i < newDigits.length; i++){
            digits[i - 1] = newDigits[i];
        }
        return digits;
    }

}
