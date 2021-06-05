package com.leetcode.arrays;

import java.util.Arrays;

public class _1480_Running_Sum {

    public static void main(String[] args) {
        _1480_Running_Sum instance = new _1480_Running_Sum();

        System.out.println(Arrays.toString(instance.runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(instance.runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(instance.runningSum(new int[]{3, 1, 2, 10, 1})));
    }

    public int[] runningSum(int[] nums) {
        int[] runningSumArr = new int[nums.length];
        runningSumArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSumArr[i] = nums[i] + runningSumArr[i - 1];
        }
        return runningSumArr;
    }
}
