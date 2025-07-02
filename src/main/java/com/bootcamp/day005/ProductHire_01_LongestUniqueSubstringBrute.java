package com.bootcamp.day005;

public class ProductHire_01_LongestUniqueSubstringBrute {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (allUnique(sub)) {
                    maxLength = Math.max(maxLength, sub.length());
                }
            }
        }

        System.out.println("Longest unique substring length = " + maxLength);
    }

    private static boolean allUnique(String s) {
        boolean[] chars = new boolean[128];
        for (char c : s.toCharArray()) {
            if (chars[c]) return false;
            chars[c] = true;
        }
        return true;
    }
}
