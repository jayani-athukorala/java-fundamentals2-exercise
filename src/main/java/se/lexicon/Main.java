package se.lexicon;


public class Main {
    static void main() {
        DateTimeExercise dateTimeEx = new DateTimeExercise();
        StringExercise stringEx = new StringExercise();

        char[] charArray = {'J','a','v','a'};

        System.out.println("---- DateTime Exercises ----");
        dateTimeEx.exercise1();
        dateTimeEx.exercise2();
        dateTimeEx.exercise3();
        dateTimeEx.exercise4();
        dateTimeEx.exercise5();
        dateTimeEx.exercise6();
        dateTimeEx.exercise7();
        dateTimeEx.exercise8();
        dateTimeEx.exercise9();
        dateTimeEx.exercise10();
        dateTimeEx.exercise11();
        dateTimeEx.exercise12();
        dateTimeEx.exercise13();
        dateTimeEx.exercise14();
        dateTimeEx.exercise15();
        dateTimeEx.exercise16();

        System.out.println("\n---- String Exercises ----");
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
