package pers.helen.primary;


import java.util.HashMap;
import java.util.List;

/**
 *
 * 206.反转链表（https://leetcode.cn/problems/reverse-linked-list/）
 */
public class Demo206 {

    public static void main(String[] args){
//        ListNode l22 = new ListNode(5);
        ListNode l1111 = new ListNode(7);
        ListNode l111 = new ListNode(3, l1111);
        ListNode l11 = new ListNode(4, l111);
        ListNode l1 = new ListNode(2, l11);
        reverseList(l1);
    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        // 当前指针，用来移动的
        ListNode cur = head.next;
        // 临时指针，用来存放新序的
        ListNode temp;
        // 旧序的头节点，即将成为新序的尾节点
        ListNode last = head;
        while(cur != null){
            temp = cur;
            cur = cur.next;
            temp.next = head;
            head = temp;
        }
        last.next = null;
        return head;
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
