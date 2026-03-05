package se.lexicon;


public class Main {
    static void main() {
        DateTimeExercise dateTimeEx = new DateTimeExercise();
        StringExercise stringEx = new StringExercise();

        char[] charArray = {'J','a','v','a'};

        IO.println("---- DateTime Exercises ----");
        dateTimeEx.displayCurrentDate();
        dateTimeEx.displayFormattedDate();
        dateTimeEx.displayLastMonday();
        dateTimeEx.parseDateFromString("1986-06-17");
        dateTimeEx.displayDayOfWeek(1986, 6, 17);
        dateTimeEx.futurePastDate(10, 10);
        dateTimeEx.periodBetweenDates(95, 5, 8);
        dateTimeEx.addPeriodToDate(4, 7, 29);
        dateTimeEx.displayCurrentTime();
        dateTimeEx.nanoSecondsLocalTime();
        dateTimeEx.parseTimeFromString("15:30:45");
        dateTimeEx.formattedCurrentTime();
        dateTimeEx.specificLocalDateTime(2018, 4, 5, 10, 35);
        dateTimeEx.formatLocalDateTime(2018, 4, 5, 10, 35);
        dateTimeEx.combineDateTime();
        dateTimeEx.extractFromLocalDateTime();

        IO.println("\n---- String Exercises ----");
        stringEx.displayLengthOfString("Java");
        stringEx.displayCharAtIndex("Long example sentence", 6);
        stringEx.displayIndexOfChar("Even longer example sentence", 'o');
        stringEx.displaySubstring("Ok this is not as long!");
        stringEx.convertLowercaseUppercase("CAPS EQUALS SCREAMING");
        stringEx.displayTrimmedString("\tJ\ta\tv\ta\t");
        stringEx.parseIntToString(20);
        stringEx.splitString("Oil and Water", " and ");
        stringEx.splitString("Carl,Susie,Fredrick,Bob,Erik", ",");
        stringEx.displayCharsOfString("ThisShouldBeConverted");
        stringEx.convertCharArrayToString(charArray);
    }
}
