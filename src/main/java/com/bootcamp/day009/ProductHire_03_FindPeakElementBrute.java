package com.bootcamp.day009;

public class ProductHire_03_FindPeakElementBrute {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean leftOK = (i == 0 || nums[i] > nums[i - 1]);
            boolean rightOK = (i == n - 1 || nums[i] > nums[i + 1]);
            if (leftOK && rightOK) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums)); // Output: 1 or 5
    }
}
