package com.leetcode;

import com.leetcode.util.ListNode;

public class _237_Delete_Node {

    public static void main(String[] args) {

        _237_Delete_Node instance = new _237_Delete_Node();

        ListNode head = new ListNode(1,2,3,4,5);
        ListNode toDelete = head.findNode(3);
        instance.deleteNode(toDelete);
        head.printList();

        head = new ListNode(4,5,1,9);
        toDelete = head.findNode(5);
        instance.deleteNode(toDelete);
        head.printList();

        head = new ListNode(4,5,1,9);
        toDelete = head.findNode(1);
        instance.deleteNode(toDelete);
        head.printList();
    }

    public void deleteNode(ListNode node) {
        ListNode temp = node;
        ListNode prev = temp;
        while(true) {
            if(temp.next != null) {

                temp.val = temp.next.val;
                prev = temp;
                temp = temp.next;
            } else {
                prev.next = null;
                break;
            }
        }
    }
}
