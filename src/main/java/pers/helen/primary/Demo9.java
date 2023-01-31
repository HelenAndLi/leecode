package pers.helen.primary;

/**
 * 9.回文数（https://leetcode.cn/problems/palindrome-number/）
 */
public class Demo9 {

    public static void main(String[] args){

        int x = 11211;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x){

        if(x < 0){
            return false;
        }
        int num = 0;
        int t = x;
        while(t != 0){
            num = num * 10 + t % 10;
            t = t / 10;
            System.out.println("num: " + num);
            System.out.println(" t : " + t);
            System.out.println("----------");
        }
        return num == x;
    }
}
