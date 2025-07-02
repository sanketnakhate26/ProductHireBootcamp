package com.bootcamp.day002;

public class ProductHire_02_PrefixSumOptimized {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 1, 4, 5};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int[][] queries = {{1, 3}, {2, 5}};

        for (int[] q : queries) {
            int i = q[0], j = q[1];
            int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            System.out.println("Sum from " + i + " to " + j + " = " + sum);
        }
    }
}
