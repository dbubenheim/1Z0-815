package exercise.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class DateAndTimeExercises {

    public static void main(final String[] args) {

        final LocalDate date = LocalDate.of(2015, 12, 24);
        System.out.println(date);

        final LocalTime time = LocalTime.of(17, 38, 26);
        System.out.println(time);

        final LocalDateTime ldt = LocalDateTime.of(date, time);
        System.out.println(ldt);
    }
}
