package com.udemy.chapter11;

public class Question06 {

    public static int run(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException e) {
            return -1;
        //} catch (ArithmeticException e) { // unreachable code, has already been caught
        //    return 0;
        } finally {
            System.out.println("done");
        }
    }

    public static void main(String[] args) {
        System.out.println(run(0, 0));
    }
}