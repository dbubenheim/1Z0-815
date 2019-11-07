package com.udemy.chapter07;

import java.util.Arrays;
import java.util.List;

public class Question07 {

    public static void main(String[] args) {

        String[] names = {"Tommy", "Mike", "Anthony" };
        List<String> list = Arrays.asList(names);
        list.set(0, "Tom");
        System.out.println(names[0]);
    }
}
