package com.bootcamp.day003;

public class ProductHire_01_LongestSubarraySumBrute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 4, 2, 3};
        int k = 5;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        System.out.println("Longest Subarray with Sum " + k + " = " + maxLength);
    }
}
