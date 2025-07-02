package com.bootcamp.day004;

public class ProductHire_02_LongestPalindromeOptimized {
    public static void main(String[] args) {
        String s = "abccccdd";
        int[] freq = new int[128];
        for (char c : s.toCharArray()) freq[c]++;

        int length = 0;
        boolean hasOdd = false;

        for (int f : freq) {
            if (f % 2 == 0) length += f;
            else {
                length += f - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) length += 1;
        System.out.println("Longest Palindrome length = " + length);
    }
}
