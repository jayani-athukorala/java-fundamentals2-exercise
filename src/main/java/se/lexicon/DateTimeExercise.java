package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.temporal.WeekFields;
import java.time.temporal.TemporalAdjusters;

public class DateTimeExercise {
    public LocalDate today = LocalDate.now();

    // Exercise 1
    public void exercise1() {
        IO.println("Current date: " + today);
    }

    // Exercise 2
    public void exercise2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv", "SE"));
        String formatedDate = today.format(formatter);
        IO.println("Current date (formatted): " + formatedDate);
    }

    // Exercise 3
    public void exercise3() {
//        WeekFields isoWeekFields = WeekFields.ISO; // Monday as first day
        LocalDate lastMonday = today
                .with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); // Adjust to last Monday
        IO.println("LocalDate of last Monday: " + lastMonday);

        IO.println("Week starting from Monday: ");
        for (int i = 0; i < 7; i++) {
            IO.println(lastMonday.plusDays(i));
        }
    }

    // Exercise 4
    public void exercise4() {
        LocalDate parsedDate = LocalDate.parse("1986-06-17");
        IO.println("Parsed date: " + parsedDate);
    }

    // Exercise 5
    public void exercise5() {
        LocalDate myBirthday = LocalDate.of(1986, 6, 17);
        IO.println("Day of '"+myBirthday+"' is: "+myBirthday.getDayOfWeek());
    }

    // Exercise 6
    public void exercise6() {
    }

    // Exercise 7
    public void exercise7() {
    }

    // Exercise 8
    public void exercise8() {
    }

    // Exercise 9
    public void exercise9() {
    }

    // Exercise 10
    public void exercise10() {
    }

    // Exercise 11
    public void exercise11() {
    }

    // Exercise 12
    public void exercise12() {
    }

    // Exercise 13
    public void exercise13() {
    }

    // Exercise 14
    public void exercise14() {
    }

    // Exercise 15
    public void exercise15() {
    }

    // Exercise 16
    public void exercise16() {
    }
}
