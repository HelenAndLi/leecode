package pers.helen.primary;

/**
 * 415.字符串相加（https://leetcode.cn/problems/add-strings/）
 */
public class Demo415 {

    public static void main(String[] args){
        //        String num1 = "456", num2 = "77";
        //        String num1 = "1", num2 = "9";
        //        String num1 = "123", num2 = "456";
        String num1 = "6994", num2 = "36";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2){
        StringBuilder result = new StringBuilder();
        char[] n1;
        char[] n2;
        if(num1.length() > num2.length()){
            n1 = num1.toCharArray();
            n2 = num2.toCharArray();
        }else{
            n2 = num1.toCharArray();
            n1 = num2.toCharArray();
        }
        boolean addOne = false;
        int j = n2.length - 1;
        for(int i = n1.length - 1; i >= 0; i--){
            int add = n1[i] - '0';

            if(addOne){
                add += 1;
                addOne = false;
            }

            if(j >= 0){
                add = add + n2[j] - '0';
                j--;
            }
            if(add > 9){
                add = add % 10;
                addOne = true;
            }
            result.insert(0, add);

        }
        if(addOne){
            result.insert(0, 1);
        }

        return result.toString();
    }
}
