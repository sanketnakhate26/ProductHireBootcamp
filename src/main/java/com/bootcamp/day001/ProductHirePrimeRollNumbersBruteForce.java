/*
 * Problem: Count Students with Prime Roll Numbers (Brute-Force)
 *
 * Description:
 * Given an array of roll numbers, count how many of them are prime numbers.
 * A prime number is only divisible by 1 and itself and greater than 1.
 *
 * Brute-force logic:
 * - For each roll number, check if it's divisible by any number from 2 to n-1.
 * - If it is, it's not prime. Otherwise, count it as prime.
 *
 * Time Complexity: O(n^2)  (for each number, checking up to n-1)
 * Space Complexity: O(1)
 */

package com.bootcamp.day001;

public class ProductHirePrimeRollNumbersBruteForce {
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

    // Brute-force prime checker: check from 2 to n-1
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;  // Not a prime
        }

        return true;
    }
}