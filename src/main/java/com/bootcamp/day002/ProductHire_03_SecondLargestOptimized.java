package com.bootcamp.day002;

public class ProductHire_03_SecondLargestOptimized {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 3, 9, 6};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second largest: " + second);
    }
}
