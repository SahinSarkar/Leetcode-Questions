package com.leetcode;

import com.leetcode.util.ListNode;

public class _1290_Bin_In_LL_To_Int {

    public static void main(String[] args) {

        _1290_Bin_In_LL_To_Int instance = new _1290_Bin_In_LL_To_Int();

        System.out.println(instance.getDecimalValue(new ListNode(1,0,1)));
        System.out.println(instance.getDecimalValue(new ListNode(0)));
        System.out.println(instance.getDecimalValue(new ListNode(1)));
        System.out.println(instance.getDecimalValue(new ListNode(1,0,0,1,0,0,1,1,1,0,0,0,0,0,0)));
        System.out.println(instance.getDecimalValue(new ListNode(0,0)));
    }

    public int getDecimalValue(ListNode head) {
        StringBuilder digits = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            digits.append(temp.val);
            temp = temp.next;
        }
        return Integer.parseInt(digits.toString(), 2);
    }
}
