package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.temporal.TemporalAdjusters;
import java.time.LocalDateTime;

public class DateTimeExercise {
    public LocalDate today = LocalDate.now();
    public LocalTime timeNow = LocalTime.now();

    // Exercise 1 : Current Date
    public void displayCurrentDate() {
        IO.println("Current date: " + today);
    }

    // Exercise 2 : Formatted Current Date ( Torsdag 29 mars)
    public void displayFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv", "SE"));
        String formatedDate = today.format(formatter);
        IO.println("Current date (formatted): " + formatedDate);
    }

    // Exercise 3 : Last Monday and the Entire Week
    public void displayLastMonday() {
        LocalDate lastMonday = today
                .with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); // Adjust to last Monday
        IO.println("LocalDate of last Monday: " + lastMonday);

        IO.println("Week starting from Monday: ");
        for (int i = 0; i < 7; i++) {
            IO.println(lastMonday.plusDays(i));
        }
    }

    // Exercise 4 : Parse Date from String
    public void parseDateFromString(String date) {
        LocalDate parsedDate = LocalDate.parse(date);
        IO.println("Parsed date: " + parsedDate);
    }

    // Exercise 5 : Day of the Week
    public void displayDayOfWeek(int year, int month, int day) {
        LocalDate myBirthday = LocalDate.of(year, month, day);
        IO.println("Day of '"+ myBirthday +"' is: "+myBirthday.getDayOfWeek());
    }

    // Exercise 6 : Future and Past Date
    public void exercise6() {
    }

    // Exercise 7
    public void exercise7() {
    }

    // Exercise 8
    public void exercise8() {
    }

    // Exercise 9 : Current Time
    public void displayCurrentTime() {
        IO.println("Current time: " + timeNow);
    }

    // Exercise 10 : Nanoseconds of LocalTime
    public void nanoSecondsLocalTime() {
        IO.println("Local Time in Nanoseconds: " + timeNow.getNano());
    }

    // Exercise 11 : Parse Time from String
    public void parseTimeFromString(String time) {
        LocalTime parsedTime = LocalTime.parse(time);
        IO.println("Parsed time: " + parsedTime);
    }

    // Exercise 12 : Formatted Current Time
    public void formattedCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Formatted time: " + timeNow.format(formatter));
    }

    // Exercise 13
    public void exercise13() {
    }

    // Exercise 14
    public void exercise14() {
    }

    // Exercise 15 : Combine Date and Time
    public void combineDateTime() {
        LocalDateTime combined = LocalDateTime.of(today, timeNow);
        IO.println("Combined Date and Time : " + combined);
    }

    // Exercise 16 : Extract Components from LocalDateTime
    public void extractFromLocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();

        IO.println("Date: " + date);
        IO.println("Time: " + time);
    }
}
