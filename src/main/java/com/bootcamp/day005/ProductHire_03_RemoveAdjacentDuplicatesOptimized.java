package com.bootcamp.day005;

public class ProductHire_03_RemoveAdjacentDuplicatesOptimized {
    public static void main(String[] args) {
        String s = "abbaca";
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        System.out.println("After removal: " + sb.toString());
    }
}
