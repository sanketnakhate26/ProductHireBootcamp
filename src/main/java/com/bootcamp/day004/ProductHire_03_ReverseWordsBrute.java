package com.bootcamp.day004;

public class ProductHire_03_ReverseWordsBrute {
    public static void main(String[] args) {
        String s = "  hello world  ";
        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            // Skip spaces
            while (end >= 0 && s.charAt(end) == ' ') end--;
            if (end < 0) break;

            int start = end;
            // Move start pointer to the beginning of the word
            while (start >= 0 && s.charAt(start) != ' ') start--;

            // Append the word to result
            result.append(s.substring(start + 1, end + 1)).append(" ");
            end = start - 1;
        }

        System.out.println("Reversed: " + result.toString().trim());
    }
}
