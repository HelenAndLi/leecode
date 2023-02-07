package pers.helen.primary;

/**
 * 2331. 计算布尔二叉树的值（https://leetcode.cn/problems/evaluate-boolean-binary-tree/）
 */
public class Demo2331 {

    public static void main(String[] args){
//        Integer[] root = new Integer[]{2, 1, 3, null, null, 0, 1};
        Integer[] root = new Integer[]{3,3,2,0,0,3,2,null,null,null,null,1,3,1,1,null,null,2,1,null,null,null,null,1,1,null,null,null,null,null,null};
        //0 1 2 +1 +2
        //1 3 4 +2 +3
        //2 5 6 +3 +4

    }

    public static boolean evaluateTree(TreeNode root){
        if(root.left == null){
            // 叶子节点
            return root.val == 0 ? false : true;
        }else{
            // 有左右节点

            // true and false
            Boolean left = null;
            Boolean right = null;
            if(root.left.val < 2){

                if(root.left.val == 1){
                    left = true;
                }else{
                    left = false;
                }

            }else{
                left = evaluateTree(root.left);
            }
            if(root.right.val < 2){
                if(root.right.val == 1){
                    right = true;
                }else{
                    right = false;
                }
            }else{
                right = evaluateTree(root.right);
            }
            if(left != null && right != null){
                if(root.val == 2){
                    return left || right;
                }else{
                    return left && right;
                }
            }
        }
        return root.val == 0 ? false : true;
    }
}

class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(){
    }

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
