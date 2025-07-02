package com.bootcamp.day002;

public class ProductHire_02_PrefixSumBrute {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 1, 4, 5};
        int[][] queries = {{1, 3}, {2, 5}};

        for (int[] q : queries) {
            int sum = 0;
            for (int i = q[0]; i <= q[1]; i++) {
                sum += arr[i];
            }
            System.out.println("Sum from " + q[0] + " to " + q[1] + " = " + sum);
        }
    }
}
