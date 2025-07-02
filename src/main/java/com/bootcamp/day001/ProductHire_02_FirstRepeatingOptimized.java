/*
 * Problem: First Repeating Roll Number (Optimized using HashSet)
 *
 * Description:
 * Given a list of roll numbers representing students entering a classroom,
 * find the first roll number that appears more than once.
 * The repeat should be detected based on first occurrence (not the smallest number).
 *
 * Optimized Approach:
 * - Use a HashSet to store already-seen roll numbers.
 * - While iterating, check if the number already exists in the set.
 *   - If yes: it's the first repeating element → return it.
 *   - If no: add it to the set.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package com.bootcamp.day001;

import java.util.HashSet;

public class ProductHire_02_FirstRepeatingOptimized {
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
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            } else {
                seen.add(num);
            }
        }

        return -1; // No repeating roll number
    }
}
