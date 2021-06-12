package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class _1431_Kids_With_More_Candies {

    public static void main(String[] args) {
        _1431_Kids_With_More_Candies instance = new _1431_Kids_With_More_Candies();

        System.out.println(instance.kidsWithCandies(new int[] {2,3,5,1,3}, 3));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largestNum = Integer.MIN_VALUE;
        for(int n : candies) {
            if(largestNum <= n) {
                largestNum = n;
            }
        }
        int threshold = largestNum - extraCandies;
        List<Boolean> canHaveMaxCandies = new ArrayList<>();
        for(int i: candies) {
            canHaveMaxCandies.add(i >= threshold);
        }

        return canHaveMaxCandies;
    }
}
