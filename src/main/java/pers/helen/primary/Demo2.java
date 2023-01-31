package pers.helen.primary;

/**
 * 【反转字符串】
 */
public class Demo2 {

    public static void main(String[] args){
        String str = "Let’s take LeetCode contest";
        String[] array = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String arr : array){
            StringBuilder sb = new StringBuilder();
            sb.append(arr);
            sb.reverse();
            result.append(sb).append(" ");
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
