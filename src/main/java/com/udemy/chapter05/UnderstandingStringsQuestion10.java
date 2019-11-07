package com.udemy.chapter05;

public class UnderstandingStringsQuestion10 {

    public static void main(String[] args) {

        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);
    }
}
