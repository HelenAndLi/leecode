package pers.helen.primary;

/**
 * 20.有效的括号（https://leetcode.cn/problems/valid-parentheses/）
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * <p>
 * 示例2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 */
public class Demo20 {

    public static void main(String[] args){
        //        String s = "(){}}{";
        //        String s = "()[]{}";
        //        String s = "(}";
        String s = "{[]}";
        System.out.println(s + ":" + isValid(s));
        s = "(}";
        System.out.println(s + ":" + isValid(s));
        s = "()[]{}";
        System.out.println(s + ":" + isValid(s));
        s = "(){}}{";
        System.out.println(s + ":" + isValid(s));

        s = "((";
        System.out.println(s + ":" + isValid(s));
        //        String cc  = "[[[";
        //        char[] c = cc.toCharArray();
        //        c[0]=' ';
        //        c[1]=' ';
        //        c[2]=' ';
        //        System.out.println(c[0]);
        //        System.out.println(String.valueOf(c).replaceAll(" ","").length());
    }

    public static boolean isValid(String s){
        int length = s.length();
        // 奇数个肯定不是
        if(length % 2 != 0){
            return false;
        }
        char[] c = s.toCharArray();
        char[] c1 = new char[length / 2];
        int j = -1;
        for(int i = 0; i < length; i++){
            if(c[i] == '[' || c[i] == '(' || c[i] == '{'){
                // 加入
                if(++j >= length / 2){
                    return false;
                }
                c1[j] = c[i];
            }else{
                if(j < 0){
                    return false;
                }
                if((c1[j] == '[' && c[i] == ']') || (c1[j] == '(' && c[i] == ')') || (c1[j] == '{' && c[i] == '}')){
                    c1[j--] = '\0';
                }else{
                    return false;
                }
            }
        }
        if(c1[0]!='\0'){
            return false;
        }
        return true;
    }
}
