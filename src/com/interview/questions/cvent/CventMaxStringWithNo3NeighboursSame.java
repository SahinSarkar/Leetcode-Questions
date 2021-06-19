package com.interview.questions.cvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CventMaxStringWithNo3NeighboursSame {

    public static void main(String[] args) {

        CventMaxStringWithNo3NeighboursSame instance =
                new CventMaxStringWithNo3NeighboursSame();

        System.out.println(instance.solution(6, 1, 1));
        System.out.println(instance.solution(1, 3, 1));
        System.out.println(instance.solution(0, 1, 8));
    }

    public String solution(int a, int b, int c) {
        List<Pair> mappingOfStrToCount = new ArrayList<>();
        mappingOfStrToCount.add(new Pair("a", a));
        mappingOfStrToCount.add(new Pair("b", b));
        mappingOfStrToCount.add(new Pair("c", c));

        Collections.sort(mappingOfStrToCount);

        String x = mappingOfStrToCount.get(0).letter;
        for (int i = 1; i < mappingOfStrToCount.get(0).count; i++) {
            x += mappingOfStrToCount.get(0).letter;
        }
        mappingOfStrToCount.get(0).letter = x;

        StringBuilder res = new StringBuilder(mappingOfStrToCount.get(0).letter);
        int i = 2;
        int j = 0;
        int t = 0;
        for (; i < mappingOfStrToCount.get(0).count && j < mappingOfStrToCount.get(1).count; i += 3, j++) {
            res.insert(i, mappingOfStrToCount.get(1).letter, 0, 1);
        }

        if (i < mappingOfStrToCount.get(0).count) {
            for (; i < mappingOfStrToCount.get(0).count && t < mappingOfStrToCount.get(2).count; i += 3, t++) {
                res.insert(i, mappingOfStrToCount.get(2).letter, 0, 1);
            }
        }

        if (t < mappingOfStrToCount.get(2).count) {
            i = 1;
            for (; i < mappingOfStrToCount.get(0).count && t < mappingOfStrToCount.get(2).count; i += 3, t++) {
                res.insert(i, mappingOfStrToCount.get(2).letter, 0, 1);
            }
        }

        for (int y = res.length() - 1; ; y--) {
            if (res.charAt(y) == res.charAt(y - 1) && res.charAt(y - 1) == res.charAt(y - 2)) {
                res.delete(y, y + 1);
            } else {
                break;
            }
        }

        return res.toString();
    }

}

class Pair implements Comparable<Pair> {
    String letter;
    int count;

    public Pair(String letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    @Override
    public int compareTo(Pair o) {
        return o.count - this.count;
    }
}
