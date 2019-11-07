package com.udemy.chapter10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question02 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2019-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        // date.plusHours(2); compile error
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        LocalDate date2 = LocalDate.parse("2019-04-31", DateTimeFormatter.ISO_LOCAL_DATE); // java.time.DateTimeException: Invalid date 'APRIL 31'
    }
}
