package com.bootcamp.day004;

import java.util.Arrays;

public class ProductHire_01_ValidAnagramBrute {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}
