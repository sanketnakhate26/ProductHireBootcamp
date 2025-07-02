/*
 * Problem: Find Student with Highest Average Marks (Brute-Force)
 *
 * Description:
 * You are given a 2D array where each row represents a student
 * and each column represents that student's marks in different subjects.
 * The goal is to calculate the average marks of each student,
 * then determine which student has the highest average.
 *
 * Brute-Force Logic:
 * - Loop through each student and calculate their average.
 * - Store each average in a separate array.
 * - Then, loop through the averages array to find the student with the highest.
 *
 * Time Complexity: O(n * m)  where n = number of students, m = number of subjects
 * Space Complexity: O(n)     for storing averages
 */

package com.bootcamp.day001;

public class ProductHire_01_HighestAverageBruteForce {public static void main(String[] args) {
    int[][] marks = {
            {85, 90, 92},
            {70, 80, 65},
            {90, 95, 88}
    };

    int n = marks.length;       // Number of students
    int m = marks[0].length;    // Number of subjects

    double[] averages = new double[n];

    // Step 1: Calculate average for each student
    for (int i = 0; i < n; i++) {
        int total = 0;
        for (int j = 0; j < m; j++) {
            total += marks[i][j];
        }
        averages[i] = (double) total / m;
    }

    // Step 2: Find student with highest average
    int topStudent = 0;
    double maxAvg = averages[0];
    for (int i = 1; i < n; i++) {
        if (averages[i] > maxAvg) {
            maxAvg = averages[i];
            topStudent = i;
        }
    }

    System.out.println("Top student is Student " + topStudent + " with average: " + maxAvg);
}
}