package com.bootcamp.day007;

import java.util.Arrays;

public class ProductHire_02_NextGreaterElementBrute {
    public static int[] nextGreater(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length && nums[j] <= nums[i]) j++;
            result[i] = j < nums.length ? nums[j] : -1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreater(new int[]{4, 5, 2, 10})));
    }
}
