package com.bootcamp.day004;

public class ProductHire_01_ValidAnagramOptimized {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (char c : t.toCharArray()) freq[c - 'a']--;

        for (int count : freq) {
            if (count != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
