package com.bootcamp.day003;

import java.util.Deque;
import java.util.LinkedList;

public class ProductHire_02_SlidingWindowMaxOptimized {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of current window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Print max when window is valid
            if (i >= k - 1) {
                System.out.print(nums[deque.peekFirst()] + " ");
            }
        }
    }
}
