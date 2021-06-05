package com.leetcode.arrays;

import java.util.Arrays;

public class _1470_Array_Shuffle {

    public static void main(String[] args) {

        _1470_Array_Shuffle instnce = new _1470_Array_Shuffle();
        System.out.println(Arrays.toString(instnce.shuffle(new int[]{2,5,1,3,4,7}, 3)));
        System.out.println(Arrays.toString(instnce.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
        System.out.println(Arrays.toString(instnce.shuffle(new int[]{1,1,2,2}, 2)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];
        for(int i=0, j=n, k=0; i<n; i++, j++, k+=2) {
            shuffledArray[k] = nums[i];
            shuffledArray[k+1] = nums[j];
        }
        return shuffledArray;
    }
}
