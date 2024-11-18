package org.strijewski.problems.checkPermutations;

import java.util.Arrays;

public class CheckPermutation {

    // Method to check if two strings are permutations of each other
    public static boolean arePermutations(String str1, String str2) {
        // If the lengths are not the same, they can't be permutations
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";

        System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are permutations? " + arePermutations(str1, str2)); // true
        System.out.println("\"" + str1 + "\" and \"" + str3 + "\" are permutations? " + arePermutations(str1, str3)); // false
    }
}