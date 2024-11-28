package org.strijewski.problems.reverseString;

public class ReverseString {

    public static String reverseString(String input) {
        // base case: one character left, return it
        if (input.length() == 1) {
            return input;
        } else {
            // recursive case:
            String lastCharacter = input.substring(input.length()-1);
            String restOfString = input.substring(0, input.length()-1);
            return lastCharacter + reverseString(restOfString);
        }
    }
    public static void main(String[] args) {
        System.out.println("Reverse of 'myHome': " + reverseString("myHome"));

    }
}
