package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CventMaxStringWithNo3NeighboursSame {

    public static void main(String[] args) {

        CventMaxStringWithNo3NeighboursSame instance =
                new CventMaxStringWithNo3NeighboursSame();

        System.out.println(instance.solution(6,1,1));
    }

    public String solution(int a, int b, int c) {
        Map<Integer, String> countToStr = new HashMap<>();
        String aStr = "";
        String bStr = "";
        String cStr = "";

        countToStr.put(a, "a");
        countToStr.put(b, "b");
        countToStr.put(c, "c");
        String[] sortedStr = new String[3];

        int max = Integer.max(c, Integer.max(a, b));
        int min = Integer.min(c, Integer.min(a, b));

        int[] sortedCount = new int[]{max, -1, min};
        for (int key : countToStr.keySet()) {
            if (max != key && min != key) {
                sortedCount[1] = key;
                break;
            }
        }

        String x = countToStr.get(sortedCount[0]);
        for (int i = 0; i < sortedCount[0]; i++) {
            x += countToStr.get(sortedCount[0]);
        }
        countToStr.put(sortedCount[0], x);

        StringBuilder res = new StringBuilder(countToStr.get(sortedCount[0]));
        int i = 2;
        for (int j = 0; i < sortedCount[0] && j < sortedCount[1]; i += 3, j++) {
            res.insert(i, countToStr.get(sortedCount[1]), 0, 1);
        }

        if(i<sortedCount[0]) {
            for(int j=0; i<sortedCount[0] && j<sortedCount[2]; i+=3, j++) {
                res.insert(i, countToStr.get(sortedCount[2]), 0, 1);
            }
        }

        for(int y=res.length()-1; ; y--) {
            if(res.charAt(y) == res.charAt(y-1) && res.charAt(y-1) == res.charAt(y-2)){
                res.delete(y, y+1);
            } else {
                break;
            }
        }

        return res.toString();
    }

}
