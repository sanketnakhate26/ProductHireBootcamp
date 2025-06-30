/*
 * Problem: Count Students with Prime Roll Numbers (Optimized)
 *
 * Description:
 * Same as brute-force, but this version uses an optimized check:
 * Instead of checking divisibility from 2 to n-1,
 * we only check up to the square root of n (√n), which is sufficient.
 *
 * Time Complexity: O(n * √k), where n = number of roll numbers, k = value of number
 * Space Complexity: O(1)
 */

package com.bootcamp.day001;

public class ProductHIrePrimeRollNumbersOptimized {
    public static void main(String[] args) {
        int[] rollNumbers = {2, 3, 4, 5, 6, 7, 9, 11, 13, 15, 17};

        int count = 0;

        for (int num : rollNumbers) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Total students with prime roll numbers: " + count);
    }

    // Optimized prime checker: check from 2 to √n
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}