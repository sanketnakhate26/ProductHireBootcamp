package com.bootcamp.day005;

public class ProductHire_02_ValidPalindromeBrute {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String forward = cleaned.toString();
        String reverse = cleaned.reverse().toString();

        System.out.println("Is palindrome: " + forward.equals(reverse));
    }
}
