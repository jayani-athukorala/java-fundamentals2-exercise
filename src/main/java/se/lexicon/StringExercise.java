package se.lexicon;

import java.util.Locale;

public class StringExercise {

    //Exercise 1
    public void exercise1() {
        IO.println("Length of 'Java': " + "Java".length());
    }

    // Exercise 2
    public void exercise2() {
        String str = "Long example sentence";
        IO.println("Char at index 6 of '"+str+"' is: " + str.charAt(6));
    }

    // Exercise 3
    public void exercise3() {
        String str = "Even longer example sentence";
        IO.println("Index of 'o' in '"+str+"' is: " + str.indexOf('o'));
    }

    // Exercise 4
    public void exercise4() {
        String str = "Ok this is not as long!";
        IO.println("Substring of '" + str +"' : " + str.substring(11, 22));
    }

    // Exercise 5
    public void exercise5() {
        String str = "CAPS EQUALS SCREAMING";
        String lowerStr = str.toLowerCase();
        IO.println("Lowercase: " + str.toLowerCase());
        IO.println("Uppercase: " + lowerStr.toUpperCase());
    }

    // Exercise 6
    public void exercise6() {
        String str = "\tJ\ta\tv\ta\t";
        IO.println("After trim : '"+ str.trim() + "'");
    }

    // Exercise 7
    public void exercise7() {
        int number = 20;
        IO.println("Parse 'int' to 'String' : " +String.valueOf(number) + 20);
    }

    // Exercise 8
    public void exercise8() {
        String str = "Oil and Water";
        String[] words = str.split(" and ");
        IO.println("Split 'Oil and Water' into 'Oil', 'Water': ");
        for (String word : words){
            IO.println(word);
        }
    }

    // Exercise 9
    public void exercise9() {
        String str = "Carl,Susie,Fredrick,Bob,Erik";
        String[] words = str.split(",");
        IO.println("Split 'Carl,Susie,Fredrick,Bob,Erik' into words: ");
        for (String word : words){
            IO.println(word);
        }
    }

    // Exercise 10
    public void exercise10() {
        String str = "ThisShouldBeConverted";
        char[] characters = str.toCharArray();
        IO.println("Convert 'String' to 'char' array : ");
        for (char character: characters) {
            IO.println(character);
        }
    }

    // Exercise 11
    public void exercise11() {
        char[] charArray = {'J','a','v','a'};
        String str = new String(charArray);
        IO.println("Convert 'char' array to 'String' : " + str);
    }
}
