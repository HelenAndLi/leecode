package pers.helen.middle;

/**
 * 6.Z字形变换（https://leetcode.cn/problems/zigzag-conversion/）
 */
public class Demo6 {

    public static void main(String[] args){
        System.out.println(13 / 5);
        System.out.println(13 % 5);
        System.out.println("------");
        System.out.println(14 / 5);
        System.out.println(14 % 5);
        System.out.println("------");
        System.out.println(15 / 5);
        System.out.println(15 % 5);
        System.out.println("------");
        System.out.println(16 / 5);
        System.out.println(16 % 5);
    }

    public static String convert(String s, int numRows){
        int count = s.length();
        int i = numRows - 1;
        int middle = numRows - 3;
        //        int j =
        if(count % (numRows - 1) == 0){

        }
        return s;
    }
}
