package com.leetcode;

import com.leetcode.util.ListNode;

import java.util.Arrays;

public class _1721_Swap_Nodes {

    public static void main(String[] args) {

        _1721_Swap_Nodes instance = new _1721_Swap_Nodes();

        instance.swapNodes(new ListNode(1,2,3,4,5), 2).printList();
        instance.swapNodes(new ListNode(1), 1).printList();
        instance.swapNodes(new ListNode(1,2), 1).printList();
        instance.swapNodes(new ListNode(1,2), 2).printList();
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode front, back, endOfList;
        front = back = endOfList = head;

        int positionFront = 1;

        while (endOfList.next != null) {
            if(positionFront != k) {
                front = front.next;
                positionFront++;
            } else {
                back = back.next;
            }
            endOfList = endOfList.next;
        }

        int tmp = front.val;
        front.val = back.val;
        back.val = tmp;

        return head;
    }
}
