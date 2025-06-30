/*
 * Problem: First Repeating Roll Number (Brute Force)
 *
 * Description:
 * Given a list of roll numbers representing students entering a classroom,
 * find the first roll number that appears more than once.
 * The repeat should be detected based on first occurrence (not the smallest number).
 *
 * Approach:
 * - Use two nested loops.
 * - For each roll number, check all the following elements to see if it repeats.
 * - Return the first roll number for which this condition is true.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

package com.bootcamp.day001;

public class ProductHireFirstRepeatingBruteForce {
    public static void main(String[] args) {
        int[] rollNumbers = {101, 105, 102, 101, 107, 105};
        int repeating = findFirstRepeating(rollNumbers);
        if (repeating != -1) {
            System.out.println("First repeating roll number: " + repeating);
        } else {
            System.out.println("No repeating roll number found.");
        }
    }

    public static int findFirstRepeating(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1; // No repeating element
    }
}