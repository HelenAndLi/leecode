package pers.helen.primary;

/**
 * 202.快乐数
 */
public class Primary202 {

    public static void main(String[] args){

        System.out.println(isHappy(19));
        System.out.println(isHappy(5));

    }

    public static boolean isHappy(int n){

        if(n == 1){
            return true;
        }
        if(n < 10){
            return false;
        }

        char[] arr = (n + "").toCharArray();
        int length = arr.length;
        int sum = 0;
        for(int i = 0; i < length; i++){
            System.out.println(Math.pow(arr[i]- '0', 2));
            sum += Math.pow(arr[i]- '0', 2);
        }
        System.out.println(sum);
        return isHappy(sum);
    }
}
