package ch5;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 1;
        ar[1] = 3;
        for (int it : ar) {
            System.out.println(it);
        }

        int[] ar2 = new int[0];
        System.out.println(ar.length);
        System.out.println(ar2.length);

        int[] score = new int[]{1, 3, 2, 4, 5};
        System.out.println(Arrays.toString(score));
        System.out.println(score);

    }
}
