package com.bootcamp.day008;

public class ProductHire_03_KokoEatingBananasBrute {
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) max = Math.max(max, pile);

        for (int k = 1; k <= max; k++) {
            if (canEatAll(piles, h, k)) return k;
        }
        return max;
    }

    public static boolean canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / k);
        }
        return hours <= h;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h)); // Output: 4
    }
}

