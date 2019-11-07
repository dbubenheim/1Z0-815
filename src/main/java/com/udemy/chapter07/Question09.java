package com.udemy.chapter07;

import java.util.ArrayList;
import java.util.List;

public class Question09 {

    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) { // Exception in thread "main" java.lang.NullPointerException
            System.out.println(age);
        }
    }
}
