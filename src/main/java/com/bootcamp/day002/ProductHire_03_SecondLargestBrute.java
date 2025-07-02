package com.bootcamp.day002;

import java.util.Arrays;

public class ProductHire_03_SecondLargestBrute {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 3, 9, 6};
        Arrays.sort(arr);
        System.out.println("Second largest: " + arr[arr.length - 2]);
    }
}
