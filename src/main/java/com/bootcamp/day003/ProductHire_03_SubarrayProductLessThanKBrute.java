package com.bootcamp.day003;

public class ProductHire_03_SubarrayProductLessThanKBrute {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                if (product < k) count++;
                else break;
            }
        }

        System.out.println("Total subarrays with product < " + k + " = " + count);
    }
}
