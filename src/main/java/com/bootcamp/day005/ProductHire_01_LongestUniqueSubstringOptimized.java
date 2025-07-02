package com.bootcamp.day005;

import java.util.HashSet;

public class ProductHire_01_LongestUniqueSubstringOptimized {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println("Longest unique substring length = " + maxLen);
    }
}
