package se.lexicon;

public class StringExercise {

    //Exercise 1 : Length of a String
    public void displayLengthOfString(String str) {
        IO.println("Length of '"+str+"': " + str.length());
    }

    // Exercise 2 : Character at Index
    public void displayCharAtIndex(String str, int index) {
        IO.println("Char at index '"+index+"' of '"+str+"' is: " + str.charAt(index));
    }

    // Exercise 3 : Index Position of given char
    public void displayIndexOfChar(String str, char position) {
        IO.println("Index of '"+position+"' in '"+str+"' is: " + str.indexOf(position));
    }

    // Exercise 4 : Substring
    public void displaySubstring(String str) {
        IO.println("Substring of '" + str +"' : " + str.substring(11, 22));
    }

    // Exercise 5 : Lowercase and Uppercase
    public void convertLowercaseUppercase(String str) {
        String lowerStr = str.toLowerCase();
        IO.println("Lowercase: " + str.toLowerCase());
        IO.println("Uppercase: " + lowerStr.toUpperCase());
    }

    // Exercise 6 : Trim String
    public void displayTrimmedString(String str) {
        IO.println("After trim : '"+ str.trim() + "'");
    }

    // Exercise 7 : Parse to String
    public void parseIntToString(int number) {
        IO.println("Parse 'int' to 'String' : " +String.valueOf(number) + 20);
    }

    // Exercise 8, 9 : Split String
    public void splitString(String str, String splitBy) {
        String[] words = str.split(splitBy);
        IO.println("Split '"+ str +"' into words: ");
        for (String word : words){
            IO.println(word);
        }
    }

    // Exercise 10 : Convert to Char Array
    public void displayCharsOfString(String str) {
        char[] characters = str.toCharArray();
        IO.println("Convert 'String' to 'char' array : ");
        for (char character: characters) {
            IO.println(character);
        }
    }

    // Exercise 11 : Convert Char Array to String
    public void convertCharArrayToString(char[] charArray) {
        String str = new String(charArray);
        IO.println("Convert 'char' array to 'String' : " + str);
    }
}
