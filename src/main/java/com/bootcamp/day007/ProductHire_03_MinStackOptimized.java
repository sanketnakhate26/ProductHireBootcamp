package com.bootcamp.day007;

import java.util.Stack;

public class ProductHire_03_MinStackOptimized {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (mainStack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        ProductHire_03_MinStackOptimized minStack = new ProductHire_03_MinStackOptimized();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        System.out.println(minStack.getMin()); // 2
        minStack.pop();
        System.out.println(minStack.getMin()); // 3
    }
}
