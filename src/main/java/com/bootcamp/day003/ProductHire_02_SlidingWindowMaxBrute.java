package com.bootcamp.day003;


public class ProductHire_02_SlidingWindowMaxBrute {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];
            for (int j = 1; j < k; j++) {
                max = Math.max(max, nums[i + j]);
            }
            System.out.print(max + " ");
        }
    }
}
