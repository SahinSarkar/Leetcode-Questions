package com.leetcode;

import com.leetcode.util.ListNode;

public class _1669_Merge_LL_Between {

    public static void main(String[] args) {

        _1669_Merge_LL_Between instance = new _1669_Merge_LL_Between();

        ListNode list1 = new ListNode(0, 1, 2, 3, 4, 5);
        ListNode list2 = new ListNode(10000, 10001, 10002);
        instance.mergeInBetween(list1, 3, 4, list2).printList();

        list1 = new ListNode(0, 1, 2, 3, 4, 5, 6);
        list2 = new ListNode(1000000, 1000001, 1000002, 1000003, 1000004);
        instance.mergeInBetween(list1, 2, 5, list2).printList();

        list1 = new ListNode(0,3,2,1,4,5);
        list2 = new ListNode(1000000,1000001,1000002);
        instance.mergeInBetween(list1, 3,4, list2).printList();
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        // we need ref to nodes a-1 and b, because these are the pointers whose next values we need to manipulate
        // first we find a, then find a-1, finding b is straight forward
        ListNode realStart = findNode(list1, a-1);
        ListNode end = findNode(list1, b);

        ListNode list2End = list2;
        while (list2End.next != null) {
            list2End = list2End.next;
        }

        realStart.next = list2;
        list2End.next = end.next;
        return list1;
    }

    public static ListNode findNode(ListNode list, int index) {
        ListNode temp = list;
        int count = 0;
        while(count != index) {
            temp = temp.next;
            count++;
        }
        return temp;
    }
}
