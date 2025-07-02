package com.bootcamp.day004;

public class ProductHire_03_ReverseWordsBrute {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        System.out.println("Reversed: " + sb);
    }
}
