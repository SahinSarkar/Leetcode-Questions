package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _921_Min_Add_For_Valid_Parens {

    public static void main(String[] args) {

        _921_Min_Add_For_Valid_Parens instance = new _921_Min_Add_For_Valid_Parens();

        System.out.println(instance.minAddToMakeValid("())"));
        System.out.println(instance.minAddToMakeValid("((("));
        System.out.println(instance.minAddToMakeValid("()"));
        System.out.println(instance.minAddToMakeValid("()))(("));
    }

    public int minAddToMakeValid(String s) {
        Deque<Character> stackOfParens = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stackOfParens.push(c);
            } else if (c == ')' && stackOfParens.peek() != null && stackOfParens.peek() == '(') {
                stackOfParens.pop();
            } else if (c == ')' &&
                    (stackOfParens.size() == 0 ||
                            (stackOfParens.peek() != null && stackOfParens.peek() != '('))) {
                stackOfParens.push(c);
            }
        }

        return stackOfParens.size();
    }
}
