package pers.helen.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * 21. 合并两个有序链表（https://leetcode.cn/problems/merge-two-sorted-lists/）
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 * <p>
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 */
public class Demo21 {

    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(4);

        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(3);
        n2.next.next = new ListNode(4);

        //        mergeTwoLists(n1, n2);
//        mergeTwoLists(new ListNode(2), null);
        mergeTwoLists(new ListNode(2), new ListNode(1));


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode res = new ListNode();
        List<Integer> result = new ArrayList<>();

        while(list1 != null){
            int a1 = list1.val;

            while(list2 != null){
                int a2 = list2.val;
                if(a1 > a2){
                    result.add(a2);
                    list2 = list2.next;
                }else{
                    result.add(a1);
                    break;
                }
            }
            if(list2 == null){
                result.add(a1);
            }
            list1 = list1.next;
        }
        while(list2 != null){
            result.add(list2.val);
            list2 = list2.next;
        }
        if(result.size() < 1){
            return null;
        }
        res.val = result.get(0);
        ListNode temp = res;

        for(int i = 1; i < result.size(); i++){
            while(temp.next == null){
                temp.next = new ListNode(result.get(i));
                temp = temp.next;
                break;
            }
        }
        return res;
    }
}
