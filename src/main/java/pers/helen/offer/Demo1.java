package pers.helen.offer;

/**
 * 2,147,483,647
 * -2,147,483,648
 */
public class Demo1 {

    public static void main(String[] args){
        //        int a = 15;
        //        int b = 2;
        //        int a = 7;
        //        int b = -3;

        //        int a = 1;
        //        int b = -1;


        //        int a = 2147483647;
        //        int b = 1;

//        int a = -2147483648;
//        int b = -1;

        int a = -2147483648;
        int b = 2;

        System.out.println(divide(a, b));
    }

    public static int divide(int a, int b){
        boolean aLow = false;
        boolean bLow = false;
        long al = a;
        long bl = b;
        if(a < 0){
            aLow = true;
        }
        if(b < 0){
            bLow = true;
        }
        al = Math.abs(al);
        bl = Math.abs(bl);

        long i = 0;
        if(al - bl == 0){
            i = 1;
        }else if(bl == 1){
            i = al;
        }else{
            while(al - bl >= 0){
                al = al - bl;
                i++;
            }
        }

        if(aLow ^ bLow){
            i = -i;
        }

        if(i < Integer.MIN_VALUE || i > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        return (int) i;
    }
}
