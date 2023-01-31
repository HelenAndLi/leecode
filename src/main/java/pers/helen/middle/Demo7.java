package pers.helen.middle;

/**
 * 7.整数反转（https://leetcode.cn/problems/reverse-integer/）
 */
public class Demo7 {

    public static void main(String[] args){
        System.out.println(reverse(-1000));
    }

    public static int reverse(int x){
        StringBuilder sb = new StringBuilder();
        boolean lowZero = false;
        if(x < 0){
            lowZero = true;
        }
        int y = Math.abs(x);
        sb.append(y);
        if(lowZero){
            sb.append("-");
        }
        sb.reverse();

        int result;
        try{
            result = Integer.valueOf(sb.toString());
        }catch(NumberFormatException e){
            return 0;
        }
        return result;
    }
}
