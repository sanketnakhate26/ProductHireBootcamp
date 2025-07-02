package com.bootcamp.day003;

public class ProductHire_01_LongestSubarraySumOptimized {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 4, 2, 3};
        int k = 5;
        int maxLength = 0, sum = 0, start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > k) {
                sum -= arr[start];
                start++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        System.out.println("Longest Subarray with Sum " + k + " = " + maxLength);
    }
}
