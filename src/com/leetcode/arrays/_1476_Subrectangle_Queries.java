package com.leetcode.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1476_Subrectangle_Queries {

    public static void main(String[] args) {

    }


}

class SubrectangleQueries {

    int[][] rectangle;

    Deque<Query> queries = new ArrayDeque<>();

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        queries.addFirst(new Query(row1, col1, row2, col2, newValue));
    }

    public int getValue(int row, int col) {
        for(Query query: queries) {
            if(query.row1 <= row && row <= query.row2 &&
            query.col1 <= col && col <= query.col2) {
                return query.newNum;
            }
        }
        return rectangle[row][col];
    }
}

class Query {
    int row1;
    int col1;
    int row2;
    int col2;
    int newNum;

    public Query(int row1, int col1, int row2, int col2, int newNum) {
        this.row1 = row1;
        this.col1 = col1;
        this.row2 = row2;
        this.col2 = col2;
        this.newNum = newNum;
    }
}
