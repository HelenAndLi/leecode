package pers.helen.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 19. 删除链表的倒数第 N 个结点（https://leetcode.cn/problems/remove-nth-node-from-end-of-list/）
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
public class Demo19 {

    public static void main(String[] args){
                ListNode head = new ListNode(1);
                head.next = new ListNode(2);
                head.next.next = new ListNode(3);
                head.next.next.next = new ListNode(4);
                head.next.next.next.next = new ListNode(5);
                head = removeNthFromEnd1(head, 2);

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head = removeNthFromEnd1(head, 1);
        System.out.println(head);
        System.out.println(4/2);
        System.out.println(3/2);
    }

    public static ListNode removeNthFromEnd1(ListNode head, int n){

        List<Integer> list = new ArrayList<>();
        toList(list, head);
        int index = list.size() - n;
        if(index == 0){
            head = head.next;
            return head;
        }
        list.remove(index);

        ListNode h1 = new ListNode(list.get(0));
        ListNode find = h1;
        for(int i = 1; i < list.size(); i++){
            find.next = new ListNode(list.get(i));
            find = find.next;
        }

        return h1;
    }

    public static void toList(List<Integer> list, ListNode head){
        if(head == null){
            return;
        }
        list.add(head.val);
        toList(list, head.next);
    }
}
