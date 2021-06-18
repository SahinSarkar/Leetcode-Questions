package com.leetcode.util;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int... nums) {
        this.val = nums[0];
        ListNode node;
        ListNode prev = this;
        for(int i=1; i< nums.length; i++) {
            node = new ListNode(nums[i], null);
            prev.next = node;
            prev = prev.next;
        }
    }

    public void printList() {
        ListNode temp = this;
        List<Integer> strOfElem = new ArrayList<>();
        while (temp != null) {
            strOfElem.add(temp.val);
            temp = temp.next;
        }
        System.out.println(strOfElem);
    }

    public ListNode findNode(int target) {
        ListNode temp = this;
        while(temp.val != target && temp != null) {
            temp = temp.next;
        }
        return temp;
    }
}
