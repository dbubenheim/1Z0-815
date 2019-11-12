package com.udemy.chapter10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Question05 {

    public static void main(String[] args) {

        // local date time
        LocalDateTime localDateTime = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // Period p = Period.of(1, 2, 3);
        Period p = Period.ofDays(1).ofYears(2);
        localDateTime = localDateTime.minus(p);

        // time
        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        System.out.println(localDateTime.format(f1));
        System.out.println(localDateTime.format(f2));
        // System.out.println(localDateTime.format(f3)); Exception in thread "main" java.time.DateTimeException: Unable to extract ZoneId from temporal 2014-03-07T11:22:33
        // System.out.println(localDateTime.format(f4)); Exception in thread "main" java.time.DateTimeException: Unable to extract ZoneId from temporal 2014-03-07T11:22:33

        // date
        DateTimeFormatter f5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter f6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter f7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter f8 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(localDateTime.format(f5));
        System.out.println(localDateTime.format(f6));
        System.out.println(localDateTime.format(f7));
        System.out.println(localDateTime.format(f8));

        // Date and time
        DateTimeFormatter f9 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter f10 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter f11 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter f12 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println(localDateTime.format(f9));
        System.out.println(localDateTime.format(f10));
        // System.out.println(localDateTime.format(f11)); Exception in thread "main" java.time.DateTimeException: Unable to extract ZoneId from temporal 2014-03-07T11:22:33
        // System.out.println(localDateTime.format(f12)); Exception in thread "main" java.time.DateTimeException: Unable to extract ZoneId from temporal 2014-03-07T11:22:33



        // zoned date time
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Berlin"));
        zonedDateTime = zonedDateTime.minus(p);

        // time
        DateTimeFormatter df1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter df3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter df4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        System.out.println(zonedDateTime.format(df1));
        System.out.println(zonedDateTime.format(df2));
        System.out.println(zonedDateTime.format(df3));
        System.out.println(zonedDateTime.format(df4));

        // date
        DateTimeFormatter df5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter df6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter df7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter df8 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(zonedDateTime.format(df5));
        System.out.println(zonedDateTime.format(df6));
        System.out.println(zonedDateTime.format(df7));
        System.out.println(zonedDateTime.format(df8));

        // Date and time
        DateTimeFormatter df9 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter df10 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter df11 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter df12 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println(zonedDateTime.format(df9));
        System.out.println(zonedDateTime.format(df10));
        System.out.println(zonedDateTime.format(df11));
        System.out.println(zonedDateTime.format(df12));
    }
}
