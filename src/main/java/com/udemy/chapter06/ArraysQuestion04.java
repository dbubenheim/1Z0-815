package com.udemy.chapter06;

import java.util.Arrays;

public class ArraysQuestion04 {

    public static void main(String[] args) {

        int[] random = { 12, 6, -4, 12, 0, 10 };
        int x = 12;
        Arrays.sort(random);
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}
