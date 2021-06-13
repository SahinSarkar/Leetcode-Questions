package com.leetcode;

public class _1021_Remove_Outermost_Parentheses {

    public static void main(String[] args) {

        _1021_Remove_Outermost_Parentheses instance = new _1021_Remove_Outermost_Parentheses();

        System.out.println(instance.removeOuterParentheses("(()())(())"));
        System.out.println(instance.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(instance.removeOuterParentheses("()()"));
    }

    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder outerParensRemovedStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && count++ > 0) {
                outerParensRemovedStr.append(s.charAt(i));
            }
            if (s.charAt(i) == ')' && count-- > 1) {
                outerParensRemovedStr.append(s.charAt(i));
            }
        }
        return outerParensRemovedStr.toString();
    }

}
