package pers.helen.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * 141. 环形链表(https://leetcode.cn/problems/linked-list-cycle)
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递
 * 。仅仅是为了标识链表的实际情况。
 * <p>
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 * 示例1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 */
public class Primary141 {

    public static void main(String[] args){

        // -21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5
        // -1
        ListNode141 head = new ListNode141(3);
        ListNode141 n2 = new ListNode141(2);
        ListNode141 n3 = new ListNode141(0);
        ListNode141 n4 = new ListNode141(-4);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        //        n4.next = n2;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode141 head){
        if(head == null){
            return false;
        }
        ListNode141 next = head.next;
        List<Integer> list = new ArrayList<>();
        List<Integer> valList = new ArrayList<>();
        list.add(head.hashCode());
        valList.add(head.val);
        while(next != null){
            if(valList.contains(next.val)){
                if(list.contains(next.hashCode())){
                    return true;
                }
            }


            list.add(next.hashCode());
            valList.add(next.val);
            next = next.next;
        }
        return false;
    }
}

class ListNode141 {

    int val;

    ListNode141 next;

    ListNode141(int x){
        val = x;
        next = null;
    }
}
