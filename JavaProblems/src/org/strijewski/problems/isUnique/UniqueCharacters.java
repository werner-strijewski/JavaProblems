package org.strijewski.problems.isUnique;

import java.util.HashSet;

public class UniqueCharacters {

    // Method to check if a string has all unique characters
    public static boolean hasUniqueCharacters(String str) {
        // Use a HashSet to track seen characters
        HashSet<Character> seenCharacters = new HashSet<>();

        for (char c : str.toCharArray()) {
            // If the character is already in the set, it's not unique
            if (seenCharacters.contains(c)) {
                return false;
            }
            seenCharacters.add(c);
        }

        return true; // All characters are unique
    }

    public static void main(String[] args) {
        String input1 = "abcdef";
        String input2 = "hello";
        String input3 = "";

        System.out.println("Does \"" + input1 + "\" have all unique characters? " + hasUniqueCharacters(input1));
        System.out.println("Does \"" + input2 + "\" have all unique characters? " + hasUniqueCharacters(input2));
        System.out.println("Does \"" + input3 + "\" have all unique characters? " + hasUniqueCharacters(input3));
    }
}