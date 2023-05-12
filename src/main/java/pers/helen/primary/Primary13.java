package pers.helen.primary;

/**
 * 13.罗马数字转整数（https://leetcode.cn/problems/roman-to-integer/）
 */
public class Primary13 {

    public static void main(String[] args){
        String s = "III";
        System.out.println(s+"="+romanToInt(s));
        s = "IV";
        System.out.println(s+"="+romanToInt(s));
        s = "IX";
        System.out.println(s+"="+romanToInt(s));
        s = "LVIII";
        System.out.println(s+"="+romanToInt(s));
        s = "MCMXCIV";
        System.out.println(s+"="+romanToInt(s));
    }

    /**
     * IV：4
     * IX：9
     * XL：40
     * XC：90
     * CD：400
     * CM：900
     *
     * @param s
     *
     * @return
     */
    public static int romanToInt(String s){
        int result = 0;
        char[] arr = s.toCharArray();

        for(int i = arr.length - 1; i > -1; ){
            char c = arr[i];
            switch(c){
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    if(i >= 1 && arr[i - 1] == 'I'){
                        result += 4;
                        i--;
                    }else{
                        result += 5;
                    }
                    break;
                case 'X':
                    if(i >= 1 && arr[i - 1] == 'I'){
                        result += 9;
                        i--;
                    }else{
                        result += 10;
                    }
                    break;
                case 'L':
                    if(i >= 1 && arr[i - 1] == 'X'){
                        result += 40;
                        i--;
                    }else{
                        result += 50;
                    }
                    break;
                case 'C':
                    if(i >= 1 && arr[i - 1] == 'X'){
                        result += 90;
                        i--;
                    }else{
                        result += 100;
                    }
                    break;
                case 'D':
                    if(i >= 1 && arr[i - 1] == 'C'){
                        result += 400;
                        i--;
                    }else{
                        result += 500;
                    }
                    break;
                case 'M':
                    if(i >= 1 && arr[i - 1] == 'C'){
                        result += 900;
                        i--;
                    }else{
                        result += 1000;
                    }
                    break;
            }
            i--;
        }


        return result;
    }
}
