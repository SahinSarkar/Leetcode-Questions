package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1441_Array_With_Stack {

    public static void main(String[] args) {
        _1441_Array_With_Stack instance = new _1441_Array_With_Stack();

        System.out.println(instance.buildArray(new int[] {1,3}, 3));
        System.out.println(instance.buildArray(new int[] {1,2,3}, 3));
        System.out.println(instance.buildArray(new int[] {1,2}, 4));
        System.out.println(instance.buildArray(new int[] {2,3,4}, 4));
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> stackOps = new ArrayList<>();
        int diff;
        for(int i=0; i<target.length; i++) {

            // finds diff but for starting element, it should be diff from 1
            diff = i==0 ? target[i] - 1 : target[i] - target[i-1];

            // if starting element is more than 1, then add push-pop sequence for entire difference
            if(i==0 && diff > 0) {
                for(int j=0; j<diff; j++) {
                    stackOps.add("Push");
                    stackOps.add("Pop");
                }
            } else {
                // for non-initial element, add push-pop sequence for missing values, which would be diff-1 times
                for(int j=0; j<diff-1; j++) {
                    stackOps.add("Push");
                    stackOps.add("Pop");
                }
            }

            // push current element
            stackOps.add("Push");
        }
        return stackOps;
    }
}
