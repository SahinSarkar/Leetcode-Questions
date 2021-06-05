package com.leetcode.hashtable;

import java.util.*;

public class _49_Group_Anagrams {

    public static void main(String[] args) {

    }

    public static List<List<String>> groupAnagrams(String[] arrOfStr) {

        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String, List<String>> mapOfAnagrams = new HashMap<>();
        for(String currStr: arrOfStr) {
            Set<String> keysOfAnagrams = mapOfAnagrams.keySet();
            for(String key: keysOfAnagrams) {
                if(isAnagram(currStr, key)) {
                    mapOfAnagrams.get(key).add(currStr);
                } else {
                    mapOfAnagrams.put(currStr, new ArrayList<>(Arrays.asList(currStr)));
                }
            }
        }

    }

    public static boolean isAnagram(String firstStr, String secondStr) {
        int[] freqOfChars = new int[26];
        for(char c: firstStr.toCharArray()) {
            freqOfChars[c - 97]++;
        }
        for (char c :
                secondStr.toCharArray()) {
            freqOfChars[c - 97]--;
        }
        boolean isAnagram = true;
        for(int freq: freqOfChars) {
            if(freq > 0) {
                return false;
            }
        }
        return true;
    }
}
