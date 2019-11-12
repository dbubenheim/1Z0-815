package com.udemy.chapter10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question04 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2019-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2); // ignored
        date.plusYears(2); // ignored
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // 2019 APRIL 30
    }
}
