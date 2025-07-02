package com.bootcamp.day005;

public class ProductHire_03_RemoveAdjacentDuplicatesBrute {
    public static void main(String[] args) {
        String s = "abbaca";
        boolean changed = true;

        while (changed) {
            changed = false;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i += 2;
                    changed = true;
                } else {
                    sb.append(s.charAt(i));
                    i++;
                }
            }
            s = sb.toString();
        }

        System.out.println("After removal: " + s);
    }
}