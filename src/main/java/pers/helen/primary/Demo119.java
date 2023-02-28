package pers.helen.primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 119.杨辉三角II（https://leetcode.cn/problems/pascals-triangle-ii/）
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: rowIndex = 3
 * 输出: [1,3,3,1]
 * 示例 2:
 * <p>
 * 输入: rowIndex = 0
 * 输出: [1]
 * 示例 3:
 * <p>
 * 输入: rowIndex = 1
 * 输出: [1,1]
 * <p>
 * <p>
 * 提示:
 * <p>
 * 0 <= rowIndex <= 33
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？
 */
public class Demo119 {

    public static void main(String[] args){
        int rowIndex = 3;
        System.out.println(Arrays.toString(getRow(rowIndex).toArray()));
    }

    public static List<Integer> getRow(int rowIndex){
        int rowNums = rowIndex + 1;

        List<List<Integer>> result = new ArrayList<>(rowNums);
        if(rowNums == 1){
            return Arrays.asList(1);
        }
        for(int i = 0; i < rowNums; i++){
            per(result, i);
        }
        return result.get(rowIndex);
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
