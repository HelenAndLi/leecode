package pers.helen.middle;

/**
 * 12. 整数转罗马数字（https://leetcode.cn/problems/integer-to-roman/）
 * <p>
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为
 * IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给你一个整数，将其转为罗马数字。
 * <p>
 * 1 <= num <= 3999
 */
public class Demo12 {

    public static void main(String[] args){
        System.out.println("1: "+intToRoman(1));
        System.out.println("2: "+intToRoman(2));
        System.out.println("4: "+intToRoman(4));
        System.out.println("5: "+intToRoman(5));
        System.out.println("8: "+intToRoman(8));
        System.out.println("9: "+intToRoman(9));
        System.out.println("10: "+intToRoman(10));
        System.out.println("13: "+intToRoman(13));
        System.out.println("14: "+intToRoman(14));
    }

    public static String intToRoman(int num){
        String result = "";
        if(num < 1){
            return null;
        }else if(num <= 5){
            if(num == 5){
                return "V";
            }
            if(num == 4){
                return "IV";
            }else{
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < num; i++){
                    sb.append("I");
                }
                return sb.toString();
            }
        }else if(num <= 10){
            if(num == 10){
                return "X";
            }
            if(num == 9){
                return "IX";
            }else{
                StringBuilder sb = new StringBuilder();
                sb.append("V");
                for(int i = 0; i < num-5; i++){
                    sb.append("I");
                }
                return sb.toString();
            }
        }else if(num <= 50){
            if(num == 50){
                return "L";
            }
            if(num == 40){
                return "XL";
            }else{
                int m = num % 10;
                int n = num / 10;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < n; i++){
                    sb.append("X");
                }
                if(m!=0){
                    if(m==4){
                        sb.append("IV");
                    }else if(m==9){

                    }else if(m<5){
                        for(int i = 0; i < m; i++){
                            sb.append("I");
                        }
                    }else{

                        sb.append("V");
                        for(int i = 0; i < num; i++){
                            sb.append("I");
                        }
                    }
                }
                return sb.toString();
            }
        }else if(num <= 100){
            if(num==100){
                return "C";
            }
        }else if(num <= 500){
            if(num==500){
                return "D";
            }
        }else{
            if(num==1000){
                return "M>";
            }
        }
        return result;
    }
}
