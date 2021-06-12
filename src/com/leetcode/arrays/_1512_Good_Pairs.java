package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class _1512_Good_Pairs {

    public static void main(String[] args) {

        _1512_Good_Pairs instance = new _1512_Good_Pairs();

        System.out.println(instance.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println(instance.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        System.out.println(instance.numIdenticalPairs(new int[]{1, 2, 3}));
        System.out.println(instance.numIdenticalPairs(new int[]{2, 2, 1, 5, 1, 5, 5, 2, 3,
                1, 1, 5, 3, 2, 3, 3, 3, 1, 3, 3, 4, 3, 1, 3, 1, 4, 5, 5, 2, 2, 1, 3, 5, 2,
                2, 4, 3, 2, 5, 3, 1, 1, 3, 3, 2, 5, 2, 1, 2, 4, 3, 4, 4, 3, 2, 4, 4, 1, 3,
                3, 3, 5, 5, 5, 4, 1, 1, 2, 3, 3, 2, 5, 3, 4, 5, 3, 1, 2, 5, 4, 5, 2, 3, 3,
                1, 5, 2, 4, 2, 4, 4, 3, 1, 3
        }));
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countOfInts = new HashMap<>();
        for (int i : nums) {
            if (countOfInts.get(i) == null) {
                countOfInts.put(i, 1);
            } else {
                countOfInts.put(i, countOfInts.get(i) + 1);
            }
        }

        int goodPairsCount = 0;
        for (int num : countOfInts.values()) {
            goodPairsCount = goodPairsCount + ((num * (num - 1)) / 2);
        }

        return goodPairsCount;
    }
}
