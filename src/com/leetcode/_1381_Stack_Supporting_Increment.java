package com.leetcode;

public class _1381_Stack_Supporting_Increment {

    public static void main(String[] args) {

    }

}

class CustomStack {

    int[] stack;
    int top;
    int maxSize;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        top = -1;
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if(top < maxSize-1) {
            top++;
            stack[top] = x;
        }
    }

    public int pop() {
        return top >= 0 ? stack[top--] : -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < k && i<maxSize; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
