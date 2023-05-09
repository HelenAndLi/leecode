package pers.helen.primary;

/**
 * 125. 验证回文串
 * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 * <p>
 * 字母和数字都属于字母数字字符。
 * <p>
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "A man, a plan, a canal: Panama"
 * 输出：true
 * 解释："amanaplanacanalpanama" 是回文串。
 * 示例 2：
 * <p>
 * 输入：s = "race a car"
 * 输出：false
 * 解释："raceacar" 不是回文串。
 * 示例 3：
 * <p>
 * 输入：s = " "
 * 输出：true
 * 解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
 * 由于空字符串正着反着读都一样，所以是回文串。
 */
public class Demo125 {

    public static void main(String[] args){
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s = " ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int length = arr.length;
        int j = length - 1;
        for(int i = 0; i < length; i++){
            if(i > j){
                break;
            }
            int ni = arr[i];
            if(ni >= '0' && ni <= '9' || ni >= 'A' && ni <= 'Z' || ni >= 'a' && ni <= 'z'){
                char ci = arr[i];
                if(ni >= 'A' && ni <= 'Z'){
                    // 大写
                    ci = (char) (arr[i] + 32);
                }
                while(i <= j){
                    int nj = arr[j];
                    if(nj >= '0' && nj <= '9' || nj >= 'A' && nj <= 'Z' || nj >= 'a' && nj <= 'z'){
                        char cj = arr[j];
                        if(nj >= 'A' && nj <= 'Z'){
                            // 大写
                            cj = (char) (arr[j] + 32);
                        }
                        if(cj == ci){
                            // 符合回文字符
                            j--;
                            break;
                        }else{
                            return false;
                        }
                    }else{
                        j--;
                        continue;
                    }
                }

            }else{
                continue;
            }

        }
        return true;
    }
}
