package com.leetcode.arrays;

public class _1880_Summation_Of_Words {

    public static void main(String[] args) {
        _1880_Summation_Of_Words instance = new _1880_Summation_Of_Words();

        System.out.println(instance.isSumEqual("acb", "cba", "cdb"));
        System.out.println(instance.isSumEqual("aaa", "a", "aab"));
        System.out.println(instance.isSumEqual("aaa", "a", "aaaa"));
        System.out.println(instance.isSumEqual("", "a", "aaaa"));
        System.out.println(instance.isSumEqual("aaa", "a", "aab"));

    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (getNumValOfStr(firstWord) + getNumValOfStr(secondWord) == getNumValOfStr(targetWord));
    }

    public int getNumValOfStr(String word) {
        String numValInString = "";
        if(!word.isEmpty()) {
            for (char c : word.toCharArray()) {
                numValInString += String.valueOf(c-97);
            }

            int numValue = Integer.parseInt(numValInString);
            return numValue;
        } else {
            return 0;
        }
    }
}
