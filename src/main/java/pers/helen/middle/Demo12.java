package pers.helen.middle;

/**
 * 12. 整数转罗马数字（https://leetcode.cn/problems/integer-to-roman/）
 */
public class Demo12 {

    public static void main(String[] args){
        System.out.println("1994: " + intToRoman(1994));
    }

    public static String intToRoman(int num){
        if(num < 1){
            return null;
        }else if(num < 5){

            if(num == 4){
                return "IV";
            }else{
                num = num % 5;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < num; i++){
                    sb.append("I");
                }
                num = 0;
                return sb.toString();
            }
        }else if(num < 10){
            if(num == 5){
                return "V";
            }else if(num == 9){
                return "IX";
            }else{
                num = num % 5;
                StringBuilder sb = new StringBuilder();
                sb.append("V");
                if(num != 0){
                    sb.append(intToRoman(num));
                }
                return sb.toString();
            }
        }else if(num < 50){

            if(num == 10){
                return "X";
            }else if(num >= 40){
                int m = num % 10;
                StringBuilder sb = new StringBuilder();
                sb.append("XL");
                if(m != 0){
                    sb.append(intToRoman(m));
                }
                return sb.toString();
            }else{
                int n = num / 10;
                num = num % 10;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < n; i++){
                    sb.append("X");
                }
                if(num != 0){
                    sb.append(intToRoman(num));
                }
                return sb.toString();
            }
        }else if(num < 100){
            if(num == 50){
                return "L";
            }else if(num >= 90){
                int m = num % 90;
                StringBuilder sb = new StringBuilder();
                sb.append("XC");
                if(m != 0){
                    sb.append(intToRoman(m));
                }
                return sb.toString();
            }else{
                int n = num / 50;
                num = num % 50;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < n; i++){
                    sb.append("L");
                }
                if(num != 0){
                    sb.append(intToRoman(num));
                }
                return sb.toString();
            }

        }else if(num < 500){
            if(num == 100){
                return "C";
            }else if(num >= 400){
                num = num % 400;
                StringBuilder sb = new StringBuilder();
                sb.append("CD");
                if(num != 0){
                    sb.append(intToRoman(num));
                }
                return sb.toString();
            }else{
                int n = num / 100;
                num = num % 100;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < n; i++){
                    sb.append("C");
                }

                if(num != 0){
                    sb.append(intToRoman(num));
                }
                return sb.toString();
            }
        }else if(num < 1000){
            if(num == 500){
                return "D";
            }else if(num >= 900){
                int m = num % 900;
                StringBuilder sb = new StringBuilder();
                sb.append("CM");
                if(m != 0){
                    sb.append(intToRoman(m));
                }
                return sb.toString();
            }else{

                int n = num / 500;
                num = num % 500;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < n; i++){
                    sb.append("D");
                }
                if(num != 0){
                    sb.append(intToRoman(num));
                }
                return sb.toString();
            }

        }else{

            int n = num / 1000;
            num = num % 1000;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++){
                sb.append("M");
            }
            if(num != 0){
                sb.append(intToRoman(num));
            }
            return sb.toString();
        }
    }
}
