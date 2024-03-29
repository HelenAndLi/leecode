package pers.helen.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 36. 有效的数独(https://leetcode.cn/problems/valid-sudoku)
 * 请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * <p>
 * <p>
 * 注意：
 * <p>
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 空白格用 '.' 表示。
 */
public class Middle36 {

    public static void main(String[] args){
        char[][] board = new char[][]
                {{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                 {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                 {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                 {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                 {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                 {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                 {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                 {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                 {'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
        //                {{
        //                        '5', '3', '.', '.', '7', '.', '.', '.', '.'
        //                }
        //                        , {
        //                        '6', '.', '.', '1', '9', '5', '.', '.', '.'
        //                }
        //                        , {
        //                        '.', '9', '8', '.', '.', '.', '.', '6', '.'
        //                }
        //                        , {
        //                        '8', '.', '.', '.', '6', '.', '.', '.', '3'
        //                }
        //                        , {
        //                        '4', '.', '.', '8', '.', '3', '.', '.', '1'
        //                }
        //                        , {
        //                        '7', '.', '.', '.', '2', '.', '.', '.', '6'
        //                }
        //                        , {
        //                        '.', '6', '.', '.', '.', '.', '2', '8', '.'
        //                }
        //                        , {
        //                        '.', '.', '.', '4', '1', '9', '.', '.', '5'
        //                }
        //                        , {
        //                        '.', '.', '.', '.', '8', '.', '.', '7', '9'
        //                }};
        System.out.println(isValidSudoku(board));
        System.out.println(0/3);
        System.out.println(1/3);
        System.out.println(2/3);
        System.out.println(3/3);
        System.out.println(4/3);
        System.out.println(5/3);
        System.out.println(6/3);
        System.out.println(7/3);
        System.out.println(8/3);
    }

    public static boolean isValidSudoku(char[][] board){
        for(int i = 0; i < board.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int current = board[i][j];
                if(list.contains(current)){
                    return false;
                }
                list.add(current);
            }
        }
        for(int i = 0; i < board.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < board[i].length; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                int current = board[j][i];
                if(list.contains(current)){
                    return false;
                }
                list.add(current);
            }
        }
        return true;
    }
}
