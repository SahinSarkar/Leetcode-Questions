package com.leetcode.arrays;

public class _1672_Richest_Customer_Wealth {

    public static void main(String[] args) {

        _1672_Richest_Customer_Wealth instance = new _1672_Richest_Customer_Wealth();

        System.out.println(instance.maximumWealth(new int[][] {{1,2,3}, {3,2,1}}));
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth= Integer.MIN_VALUE;
        for(int[] account: accounts) {
            int sum = 0;
            for(int balance: account) {
                sum += balance;
            }
            if(maxWealth < sum) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
