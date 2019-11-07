package com.udemy.chapter08;

public class Question07 {

    public static void swing() {
        System.out.println("swing");
    }


    public void climb() {
        System.out.println("climb");
    }

    public static void play() {
        swing();
        //climb(); // Compile error
    }

    public static void main(String[] args) {

        Question07 q1 = new Question07();
        q1.play();

        Question07 q2 = null;
        q2.play(); // static member accessed via instance reference
    }
}
