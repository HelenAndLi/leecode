package pers.helen.middle.demo2;

import java.util.List;

/**
 * 2.两数相加（https://leetcode.cn/problems/add-two-numbers/）
 */
public class Demo2 {

    public static void main(String[] args){
        ListNode l1 = new ListNode(5);
        ListNode l0 = new ListNode(5);
        //942+9465 = 4 0 7
//        ListNode l3 = new ListNode(9);
//        ListNode l2 = new ListNode(4, l3);
//        ListNode l1 = new ListNode(2, l2);
//
//        ListNode l0000 = new ListNode(9);
//        ListNode l000 = new ListNode(4, l0000);
//        ListNode l00 = new ListNode(6, l000);
//        ListNode l0 = new ListNode(5, l00);
        //7342 + 465 =
        //        ListNode l7 = new ListNode(9);
        //        ListNode l6 = new ListNode(9, l7);
        //        ListNode l5 = new ListNode(9, l6);
        //        ListNode l4 = new ListNode(9, l5);
        //        ListNode l3 = new ListNode(9, l4);
        //        ListNode l2 = new ListNode(9, l3);
        //        ListNode l1 = new ListNode(9, l2);
        //
        //        ListNode l0000 = new ListNode(9);
        //        ListNode l000 = new ListNode(9, l0000);
        //        ListNode l00 = new ListNode(9, l000);
        //        ListNode l0 = new ListNode(9, l00);
        // 321+654 = 975
        // 361+854 = 1215
        //        ListNode l111 = new ListNode(3);
        //        ListNode l11 = new ListNode(4, l111);
        //        ListNode l1 = new ListNode(2, l11);
        //
        //        ListNode l222 = new ListNode(4);
        //        ListNode l22 = new ListNode(6, l222);
        //        ListNode l2 = new ListNode(5, l22);

        System.out.println(addTwoNumbers(l1, l0));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode res = null;
        boolean add = false;
        int sum;
        int c1 = 0;
        int c2 = 0;
        while(cur1 != null){
            c1 = cur1.val;
            if(cur2 == null){
                c2 = 0;
            }else{
                c2 = cur2.val;
                cur2 = cur2.next;
            }
            sum = c1 + c2;
            if(add){
                sum += 1;
            }
            if(sum >= 10){
                sum = sum - 10;
                add = true;
            }else{
                add = false;
            }
            System.out.println(sum);
            res = new ListNode(sum, res);
            cur1 = cur1.next;

        }
        if(add){
            res.val = c1 + c2 + 1;
        }
        add = false;
        if(res.val >= 10){
            res.val = res.val - 10;
            add = true;
        }
        while(cur2 != null){
            // cur2 还有
            int edit = cur2.val;
            if(add == true){
                edit += 1;
            }
            if(edit >= 10){
                edit = edit - 10;
                add = true;
            }else{
                add = false;
            }
            res = new ListNode(edit, res);
            cur2 = cur2.next;
        }
        if(add){
            res = new ListNode(1, res);
        }
        if(res.val >= 10){
            int a = res.val / 10;
            res.val = res.val - 10;
            res = new ListNode(a, res);
        }

        ListNode cur3 = res.next;
        ListNode last = res;
        ListNode temp;
        while(cur3 != null){
            temp = cur3;
            cur3 = cur3.next;
            temp.next = res;
            res = temp;
        }
        last.next = null;
        return res;
    }
}
