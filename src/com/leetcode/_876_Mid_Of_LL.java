package com.leetcode;

import com.leetcode.util.ListNode;

public class _876_Mid_Of_LL {

    public static void main(String[] args) {

        _876_Mid_Of_LL instance = new _876_Mid_Of_LL();

        instance.middleNode(new ListNode(1,2,3,4,5)).printList();
        instance.middleNode(new ListNode(1,2,3,4,5,6,7,8)).printList();
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
