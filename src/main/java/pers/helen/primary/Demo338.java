package pers.helen.primary;

/**
 * 338.比特位计数
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：[0,1,1]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：[0,1,1,2,1,2]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= n <= 10^5
 */
public class Demo338 {

    public static void main(String[] args){
        int n = 8;
        getHex(n);

    }

    public static String getHex(int n){
        int i = 0;
        while(n >= (2 << (i - 1))){
            i++;
        }

        System.out.println(i - 1);
        return "";
    }
}
