package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1769_Count_To_Move_Balls {

    public static void main(String[] args) {

        _1769_Count_To_Move_Balls instance = new _1769_Count_To_Move_Balls();

        System.out.println(Arrays.toString(instance.minOperations("110")));
        System.out.println(Arrays.toString(instance.minOperations("001011")));
    }

    public int[] minOperations(String boxes) {
        int[] minOps = new int[boxes.length()];
        for(int i=0; i<minOps.length; i++) {

            for(int j=0; j<boxes.length(); j++) {
                if(boxes.charAt(j) == '1') {
                    minOps[i] += Math.abs(j - i);
                }
            }
        }
        return minOps;
    }
}
