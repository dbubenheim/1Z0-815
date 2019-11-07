package com.udemy.chapter09;

import java.util.ArrayList;

public interface Question06 {

    int amount = 6;

    // public static void eatPlant(); static methods in interfaces should have a body

    public static void eatPlant() {
        System.out.println("hey");
    }

    // public int chew() { return 13; } // Interface abstract methods cannot have a body

    public default int chew() {

        ArrayList<String> a = new ArrayList();
        a.remove("");

        return 13;
    }
}