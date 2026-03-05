package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.temporal.TemporalAdjusters;

public class DateTimeExercise {
    public LocalDate today = LocalDate.now();
    public LocalTime timeNow = LocalTime.now();

    // Exercise 1 : Current Date
    public void displayCurrentDate() {
        IO.println("Current date: " + today);
    }

    // Exercise 2 : Formatted Current Date ( Torsdag 29 mars)
    public void displayFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM", Locale.forLanguageTag("sv-SE"));
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
    public void futurePastDate(int yearsToAdd, int monthsToSubtract) {
        LocalDate modifiedDate = LocalDate.now()
                .plusYears(yearsToAdd)
                .minusMonths(monthsToSubtract);

        IO.println("Month: " + modifiedDate.getMonth());
    }

    // Exercise 7 : Period Between Dates
    public void periodBetweenDates(int year, int month, int dayOfMonth) {
        LocalDate birthDate = LocalDate.of(year, month, dayOfMonth);
        LocalDate futureDate = LocalDate.now()
                .plusYears(10)
                .minusMonths(10);

        Period period = Period.between(birthDate, futureDate);

        IO.println("Period: "
                + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days");
    }

    // Exercise 8 : Add Period to Current Date
    public void addPeriodToDate(int years, int months, int days) {
        Period period = Period.of(years, months, days);
        LocalDate newDate = LocalDate.now().plus(period);

        IO.println("Date after adding period: " + newDate);
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

    // Exercise 12 : Formatted Current Time (10:32:53)
    public void formattedCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Formatted time: " + timeNow.format(formatter));
    }

    // Exercise 13 : Specific LocalDateTime (date: 2018-04-05, time: 10.00)
    public void specificLocalDateTime(int year, int month, int dayOfMonth, int hour, int minute) {
        LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
        IO.println("Specific LocalDateTime: " + dateTime);
    }

    // Exercise 14: Formatted LocalDateTime (torsdag 5 april 10:00)
    public void formatLocalDateTime(int year, int month, int dayOfMonth, int hour, int minute) {
        LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm",
                Locale.forLanguageTag("sv-SE"));

        IO.println("Formatted LocalDateTime: " + dateTime.format(formatter));
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
