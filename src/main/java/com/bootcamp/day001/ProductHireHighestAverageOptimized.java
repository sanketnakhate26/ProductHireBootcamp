/*
 * Problem: Find Student with Highest Average Marks (Optimized)
 *
 * Description:
 * Same as above — we are given a 2D array where each row is a student,
 * and each column represents a subject's mark. The goal is to find the
 * student with the highest average marks.
 *
 * Optimized Logic:
 * - Instead of storing all averages in an array, calculate each average on the fly.
 * - Track the highest average and corresponding student index while iterating.
 *
 * Time Complexity: O(n * m)  (same as brute-force)
 * Space Complexity: O(1)     (no extra array used)
 */

package com.bootcamp.day001;

public class ProductHireHighestAverageOptimized {
    public static void main(String[] args) {
        int[][] marks = {
                {85, 90, 92},
                {70, 80, 65},
                {90, 95, 88}
        };

        int n = marks.length;
        int m = marks[0].length;

        int topStudent = -1;
        double maxAvg = -1;

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < m; j++) {
                total += marks[i][j];
            }
            double avg = (double) total / m;

            if (avg > maxAvg) {
                maxAvg = avg;
                topStudent = i;
            }
        }

        System.out.println("Top student is Student " + topStudent + " with average: " + maxAvg);
    }
}