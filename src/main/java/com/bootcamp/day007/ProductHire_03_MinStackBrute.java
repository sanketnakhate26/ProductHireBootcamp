package com.bootcamp.day007;

import java.util.Stack;

public class ProductHire_03_MinStackBrute {
    Stack<Integer> stack = new Stack<>();

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int val : stack) {
            min = Math.min(min, val);
        }
        return min;
    }

    public static void main(String[] args) {
        ProductHire_03_MinStackBrute minStack = new ProductHire_03_MinStackBrute();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        System.out.println(minStack.getMin()); // 2
        minStack.pop();
        System.out.println(minStack.getMin()); // 3
    }
}
