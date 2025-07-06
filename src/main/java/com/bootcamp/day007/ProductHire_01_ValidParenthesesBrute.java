package com.bootcamp.day007;

public class ProductHire_01_ValidParenthesesBrute {
    public static boolean isValid(String s) {
        String prev = "";
        while (!s.equals(prev)) {
            prev = s;
            s = s.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("([)]"));    // false
    }
}
