package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1047_Remove_Adjacent_Duplicates {

    public static void main(String[] args) {

        _1047_Remove_Adjacent_Duplicates instance = new _1047_Remove_Adjacent_Duplicates();

        System.out.println(instance.removeDuplicates("abbaca"));
        System.out.println(instance.removeDuplicates("azxxzy"));
    }

    public String removeDuplicates(String s) {
        Deque<Character> charStack = new ArrayDeque<>();

        for(int i=0; i < s.length(); i++) {
            if(charStack.peekFirst() == null || charStack.peekFirst() != s.charAt(i)) {
                charStack.addFirst(s.charAt(i));
            } else if(charStack.peekFirst() == s.charAt(i)) {
                charStack.pollFirst();
            }
        }

        StringBuilder resultantStr = new StringBuilder();
        while (!charStack.isEmpty()) {
            resultantStr.append(charStack.pollLast());
        }
        return resultantStr.toString();
    }
}
