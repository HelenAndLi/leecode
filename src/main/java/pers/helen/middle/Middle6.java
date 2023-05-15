package pers.helen.middle;

/**
 * 6. N 字形变换(https://leetcode.cn/problems/zigzag-conversion)
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 示例 3：
 * <p>
 * 输入：s = "A", numRows = 1
 * 输出："A"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s 由英文字母（小写和大写）、',' 和 '.' 组成
 * 1 <= numRows <= 1000
 */
public class Middle6 {

    public static void main(String[] args){
        //        String s = "AB";
        //        int numRows = 1;
        //        String s = "PAYPALISHIRING";
        //        int numRows = 3;
        String s = "A";
        int numRows = 2;
        System.out.println(convert(s, numRows));
    }

    // PAHNAPLSIIGYIR
    public static String convert(String s, int numRows){
        char[] arr1 = s.toCharArray();
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        if(numRows == 1 || length < numRows){
            return s;
        }

        for(int i = 0; i < numRows; i++){
            int locate = i;
            sb.append(arr1[i]);
            while(locate < length){
                int locate1 = locate + 2 * (numRows - i - 1);
                if(locate1 >= length){
                    break;
                }
                if(locate != locate1){
                    sb.append(arr1[locate1]);
                    locate = locate1;// 位置1
                }
                locate += 2 * i;// 位置2
                if(locate >= length){
                    break;
                }
                if(locate1 == locate){
                    continue;
                }
                sb.append(arr1[locate]);
            }
        }
        return sb.toString();
    }
}
