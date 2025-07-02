package com.bootcamp.day003;

public class ProductHire_03_SubarrayProductLessThanKOptimized {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        if (k <= 1) {
            System.out.println("0");
            return;
        }

        int product = 1, count = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left++];
            }
            count += right - left + 1;
        }

        System.out.println("Total subarrays with product < " + k + " = " + count);
    }
}
