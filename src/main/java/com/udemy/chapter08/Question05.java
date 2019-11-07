package com.udemy.chapter08;

public class Question05 {

    public static int count(boolean b1, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {

        System.out.println(count(true));
        System.out.println(count(true, true));
        System.out.println(count(true, true, true));
        //System.out.println(count(true, {true, true})); // Array initializer is not allowed here
        System.out.println(count(true, new boolean[2]));
    }
}
