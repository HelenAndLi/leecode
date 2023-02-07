package pers.helen.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.两数相加（https://leetcode.cn/problems/add-two-numbers/）
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 */
public class Demo2 {

    public static void main(String[] args){
        //        ListNode l0 = new ListNode(2);
        //        l0.next = new ListNode(4);
        //        l0.next.next = new ListNode(3);
        //
        //        ListNode l1 = new ListNode(5);
        //        l1.next = new ListNode(6);
        //        l1.next.next = new ListNode(4);

        //        ListNode l0 = new ListNode(9);
        //        ListNode l1 = new ListNode(1);
        //        l1.next = new ListNode(9);
        //        l1.next.next = new ListNode(9);
        //        l1.next.next.next = new ListNode(9);
        //        l1.next.next.next.next = new ListNode(9);
        //        l1.next.next.next.next.next = new ListNode(9);
        //        l1.next.next.next.next.next.next = new ListNode(9);
        //        l1.next.next.next.next.next.next.next = new ListNode(9);
        //        l1.next.next.next.next.next.next.next.next = new ListNode(9);
        //        l1.next.next.next.next.next.next.next.next.next = new ListNode(9);

        // [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
        // [5,6,4]
//        ListNode l0 = new ListNode(1);
//        l0.next = new ListNode(0);
//        l0.next.next = new ListNode(0);
//        l0.next.next.next = new ListNode(0);
//        l0.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next =
//                new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next =
//                new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next =
//                new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        l0.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
//
//        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(6);
//        l1.next.next = new ListNode(4);
        ListNode l0 = new ListNode(9);
        l0.next = new ListNode(9);
        l0.next.next = new ListNode(9);
        l0.next.next.next = new ListNode(9);
        l0.next.next.next.next = new ListNode(9);
        l0.next.next.next.next.next = new ListNode(9);
        l0.next.next.next.next.next.next = new ListNode(9);

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        System.out.println(addTwoNumbers1(l0, l1));
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2){
        ListNode res = new ListNode();
        List<Integer> list = new ArrayList<>();
        boolean add = false;
        while(l1 != null){
            int sum = l1.val;
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            if(add){
                sum++;
            }
            if(sum > 9){
                list.add(sum % 10);
                add = true;
            }else{
                list.add(sum);
                add = false;
            }
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val;
            if(add){
                sum = l2.val+1;
            }
            if(sum > 9){
                list.add(sum % 10);
                add = true;
            }else{
                list.add(sum);
                add = false;
            }
            l2 = l2.next;
        }
        if(add){
            list.add(1);
        }
        res.val = list.get(0);
        ListNode temp = res;
        for(int i = 1; i < list.size(); i++){
            while(temp.next == null){
                temp.next = new ListNode(list.get(i));
                temp = temp.next;
                break;
            }
        }
        return res;
    }

}

class ListNode {

    int val;

    ListNode next;

    ListNode(){
    }

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}
