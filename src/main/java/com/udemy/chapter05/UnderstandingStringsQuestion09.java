package com.udemy.chapter05;

public class UnderstandingStringsQuestion09 {

    public static void main(String[] args) {

        int total = 0;
        StringBuilder letters = new StringBuilder();
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length(); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: start 1, end 2, length 0
        System.out.println(total);
    }
}
