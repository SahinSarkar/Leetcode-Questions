package com.leetcode.matrix;

public class _74_Search_Matrix {

    public static void main(String[] args) {

        _74_Search_Matrix instance = new _74_Search_Matrix();

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(instance.searchMatrix(matrix, 3));

        int[][] matrix1 = {{1}};
        System.out.println(instance.searchMatrix(matrix1, 1));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int searchRow = narrowDownRowToSearch(matrix, target);
        if(searchRow == -1) {
            return false;
        }
        int index = searchElementInRow(matrix[searchRow], target);
        return index != -1;
    }

    int narrowDownRowToSearch(int[][] matrix, int target) {
        for(int i=matrix.length-1; i>=0; i--) {
            if(matrix[i][0] <= target) {
                return i;
            }
        }
        return -1;
    }

    int searchElementInRow(int[] numArr, int target) {
        int low = 0;
        int high = numArr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (numArr[mid] > target) {
                high = mid - 1;
            } else if (numArr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
