package pers.helen.middle;

/**
 * 74.搜索二维矩阵
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 */
public class Middle74 {

    public static void main(String[] args){
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 24;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        for(int i = 0; i < matrix.length; i++){
            for(int j = matrix[i].length - 1; j > -1; j--){
                if(target > matrix[i][j]){
                    break;
                }else if(target==matrix[i][j]){
                   return true;
                }
            }
        }
        return false;
    }

}
