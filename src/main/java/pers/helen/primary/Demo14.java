package pers.helen.primary;

/**
 * 14.最长公共前缀（https://leetcode.cn/problems/longest-common-prefix/）
 */
public class Demo14 {

    public static void main(String[] args){
        //        String[] strs = {"flower", "flow", "flight"};
        //        String[] strs = {"", "b"};
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        // 找出最长的词
        String longest = "";
        for(String str : strs){
            if(str.length() > longest.length()){
                longest = str;
            }
        }
        int min = longest.length();
        char[] longestChars = longest.toCharArray();
        for(String str : strs){
            if(str.equals(longest)){
                continue;
            }
            if(str.length() == 0){
                min = 0;
                break;
            }
            int temp = 0;
            char[] strChars = str.toCharArray();
            for(int i = 0; i < str.length(); i++){
                if(strChars[i] == longestChars[i]){
                    temp++;
                    continue;
                }else{
                    break;
                }
            }
            if(temp < min){
                min = temp;
            }
        }
        // 找出跟它匹配得最少的那个词
        return longest.substring(0, min);
    }
}
