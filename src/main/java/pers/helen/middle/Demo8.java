package pers.helen.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 8. 字符串转换整数 (atoi)（https://leetcode.cn/problems/string-to-integer-atoi/）
 * 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 * <p>
 * 函数 myAtoi(string s) 的算法如下：
 * <p>
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
 * 返回整数作为最终结果。
 * 注意：
 * <p>
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "42"
 * 输出：42
 * 解释：加粗的字符串为已经读入的字符，插入符号是当前读取的字符。
 * 第 1 步："42"（当前没有读入字符，因为没有前导空格）
 * ^
 * 第 2 步："42"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
 * ^
 * 第 3 步："42"（读入 "42"）
 * ^
 * 解析得到整数 42 。
 * 由于 "42" 在范围 [-231, 231 - 1] 内，最终结果为 42 。
 * 示例 2：
 * <p>
 * 输入：s = "   -42"
 * 输出：-42
 * 解释：
 * 第 1 步："   -42"（读入前导空格，但忽视掉）
 * ^
 * 第 2 步："   -42"（读入 '-' 字符，所以结果应该是负数）
 * ^
 * 第 3 步："   -42"（读入 "42"）
 * ^
 * 解析得到整数 -42 。
 * 由于 "-42" 在范围 [-231, 231 - 1] 内，最终结果为 -42 。
 * 示例 3：
 * <p>
 * 输入：s = "4193 with words"
 * 输出：4193
 * 解释：
 * 第 1 步："4193 with words"（当前没有读入字符，因为没有前导空格）
 * ^
 * 第 2 步："4193 with words"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
 * ^
 * 第 3 步："4193 with words"（读入 "4193"；由于下一个字符不是一个数字，所以读入停止）
 * ^
 * 解析得到整数 4193 。
 * 由于 "4193" 在范围 [-231, 231 - 1] 内，最终结果为 4193 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 200
 * s 由英文字母（大写和小写）、数字（0-9）、' '、'+'、'-' 和 '.' 组成
 */
public class Demo8 {

    public static void main(String[] args){
        System.out.println(myAtoi("+") == 0);
        System.out.println(myAtoi("+-12") == 0);
        System.out.println(myAtoi("   +0 123") == 0);
        System.out.println(myAtoi("   -42") == -42);
        System.out.println(myAtoi("4193 with words") == 4193);
        System.out.println(myAtoi("words and 987") == 0);
        System.out.println(myAtoi("0 1") == 0);
        System.out.println(myAtoi("-5-") == -5);
        System.out.println(myAtoi("  0000000000012345678") == 12345678);
        System.out.println(myAtoi("00000-42a1234") == 0);
        System.out.println(myAtoi("1095502006p8") == 1095502006);
        System.out.println(myAtoi("-1095502006p8") == -1095502006);
        System.out.println(myAtoi("-2295502006p8") == (int) -Math.pow(2, 31));
        System.out.println(myAtoi("    +1146905820n1") == 1146905820);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.valueOf("2147483649"));
    }

    public static int myAtoi(String s){
        StringBuilder sb = new StringBuilder();
        char[] cl = s.toCharArray();
        boolean containNum = false;
        boolean canSymbol = true;
        for(char c : cl){
            if(c == ' '){
                if(sb.length() > 0 || !canSymbol){
                    break;
                }
                continue;
            }else if(c == '-' || c == '+'){
                if(!canSymbol){
                    if(containNum){
                        break;
                    }
                    return 0;
                }
                if(sb.length() == 0){
                    sb.append(c);
                    canSymbol = false;
                }
            }else if(c >= '0' && c <= '9'){
                canSymbol = false;
                if(!containNum && c == '0'){
                    continue;
                }
                sb.append(c);
                containNum = true;
            }else{
                break;
            }
        }

        if(sb.length() == 0 || !containNum){
            return 0;
        }

        if(sb.indexOf("+") == 0){
            sb.deleteCharAt(0);
        }
        char[] sChar = sb.toString().toCharArray();
        char[] minChars;
        int min;
        if(sb.indexOf("-") > -1){
            // 负数
            min = (int) -Math.pow(2, 31);
        }else{
            // 正数
            min = (int) Math.pow(2, 31);
        }
        minChars = String.valueOf(min).toCharArray();
        int sLen = sChar.length;
        int mLen = minChars.length;
        if(sLen > mLen){
            return min;
        }else if(sLen == mLen){
            for(int i = 0; i < sLen; i++){
                int a = sChar[i];
                int b = minChars[i];
                if(a > b)
                    return min;
                else if(a < b)
                    break;
            }
            return Integer.parseInt(sb.toString());
        }else{
            return Integer.parseInt(sb.toString());
        }
    }

    public static int myAtoi1(String s){
        StringBuilder sb = new StringBuilder();
        char[] cl = s.toCharArray();
        boolean containNum = false;
        int numIndex = 0;
        for(char c : cl){
            if(c == ' ' && sb.toString().length() == 0 && numIndex == 0){
                continue;
            }else if(c == '-' || c == '+'){
                if(numIndex != 0 && !containNum){
                    return 0;
                }
                if(sb.length() == 0){
                    sb.append(c);
                }else{
                    if(containNum){
                        break;
                    }else{
                        return 0;
                    }
                }
            }else if(c >= '0' && c <= '9'){
                numIndex++;
                if(!containNum && c == '0'){
                    continue;
                }
                sb.append(c);
                containNum = true;
            }else{
                break;
            }
        }

        if(sb.length() == 0 || !containNum){
            return 0;
        }
        if(sb.indexOf("-") > -1 && sb.indexOf("+") > -1){
            return 0;
        }
        if(sb.indexOf("+") == 0){
            sb.deleteCharAt(0);
        }
        char[] sChar = sb.toString().toCharArray();
        char[] minChars;
        int min;
        if(sb.indexOf("-") > -1){
            // 负数
            min = (int) -Math.pow(2, 31);
        }else{
            // 正数
            min = (int) Math.pow(2, 31);
        }
        minChars = String.valueOf(min).toCharArray();
        if(sChar.length > minChars.length){
            return min;
        }else if(sChar.length == minChars.length){
            for(int i = 0; i < sChar.length; i++){
                if(sChar[i] > minChars[i])
                    return min;
                else if(sChar[i] < minChars[i])
                    break;
            }
            return Integer.valueOf(sb.toString());
        }else{
            return Integer.valueOf(sb.toString());
        }
    }
}
