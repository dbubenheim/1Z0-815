package com.udemy.chapter10;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Question01 {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2012, 6, 21);
        LocalDate date2 = LocalDate.of(2012, Month.JUNE, 21);
        LocalDate date3 = LocalDate.of(2012, Calendar.JUNE, 21); // old api, creates May

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }

}
