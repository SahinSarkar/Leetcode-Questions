package com.leetcode.hashtable;

import java.util.*;

public class _49_Group_Anagrams {

    public static void main(String[] args) {

        _49_Group_Anagrams instance = new _49_Group_Anagrams();
        System.out.println(instance.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(instance.groupAnagrams(new String[]{""}));
        System.out.println(instance.groupAnagrams(new String[]{"a"}));
    }

    public List<List<String>> groupAnagrams(String[] arrOfStr) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        String[] letterSortedWords = new String[arrOfStr.length];
        for(int i=0; i<arrOfStr.length; i++) {
            char[] charBreakdownOfStr = arrOfStr[i].toCharArray();
            Arrays.sort(charBreakdownOfStr);
            letterSortedWords[i] = String.valueOf(charBreakdownOfStr);
        }
        Map<String, List<String>> mapGroupingOfAnagrams = createMapFromLetterSortedWordsAndWords(arrOfStr, letterSortedWords);

        for(String key: mapGroupingOfAnagrams.keySet()) {
            groupedAnagrams.add(mapGroupingOfAnagrams.get(key));
        }
        return groupedAnagrams;
    }

    public Map<String, List<String>> createMapFromLetterSortedWordsAndWords(String[] actualWords, String[] letterSortedWords) {
        Map<String, List<String>> anagramsGroupedInMap = new HashMap<>();
        for(int i=0; i<actualWords.length; i++) {
            if(anagramsGroupedInMap.keySet().contains(letterSortedWords[i])) {
                anagramsGroupedInMap.get(letterSortedWords[i]).add(actualWords[i]);
            } else {
                anagramsGroupedInMap.put(letterSortedWords[i], new ArrayList<>(Arrays.asList(actualWords[i])));
            }
        }
        return anagramsGroupedInMap;
    }

    public boolean isAnagram(String firstStr, String secondStr) {
        int[] freqOfChars = new int[26];
        for (char c : firstStr.toCharArray()) {
            freqOfChars[c - 97]++;
        }
        for (char c : secondStr.toCharArray()) {
            freqOfChars[c - 97]--;
        }
        for (int freq : freqOfChars) {
            if (freq > 0) {
                return false;
            }
        }
        return true;
    }
}
