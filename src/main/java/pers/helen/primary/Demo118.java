package pers.helen.primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 118. 杨辉三角（https://leetcode.cn/problems/pascals-triangle/）
 * <p>
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 示例 2:
 * <p>
 * 输入: numRows = 1
 * 输出: [[1]]
 * <p>
 * <p>
 * 提示:
 * <p>
 * 1 <= numRows <= 30
 */
public class Demo118 {

    // 第n层，元素共n个，下标为i的元素，值为：n-1[i-1]+n-1[i]
    public static void main(String[] args){
        int numRows = 7;
        System.out.println(Arrays.toString(generate(numRows).toArray()));
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>(numRows);
        if(numRows == 1){
            result.add(Arrays.asList(1));
            return result;
        }
        for(int i = 0; i < numRows; i++){
            per(result, i);
        }
        return result;
    }

    public static void per(List<List<Integer>> result, int row){
        if(row == 0){
            result.add(Arrays.asList(1));
            return;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> before = result.get(row - 1);
        for(int i = 1; i <= row; i++){
            int a = before.get(i - 1);
            if(before.size() == i){
                list.add(1);
            }else{
                list.add(a + before.get(i));
            }
        }
        result.add(list);
    }
}
