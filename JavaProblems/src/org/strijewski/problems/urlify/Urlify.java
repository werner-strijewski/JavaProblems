package org.strijewski.problems.urlify;

// Write a method that replaces all instances of space in a char array by "%20"
// Input is char[] and 'true' length of string
// Output is the same char array that was input, with the result string
// Assume the char[] has sufficient length to hold the new array

// 'Mr John Smith    ', 13
//  01234567890123456

// 'Mr John Smith Kline     ', 19
//  012345678901234567890123

public class Urlify {
    public static char[] urlify(char[] charArray, int trueLength) {
        // assume the char[] has sufficient length to hold the new array
        int index = trueLength - 1; // the last non-space character is at this index
        int endOfCharArrayIndex = charArray.length - 1; // the last character in the char array

        // we're going to start from the back of the array, so we can overwrite the spaces at the end
        while (index > 0) {
            if (' ' == charArray[index]) {
                int secondIndex = endOfCharArrayIndex;
                while (secondIndex > (index + 2)) {
                    charArray[secondIndex] = charArray[secondIndex-2];
                    secondIndex--;
                }
                charArray[secondIndex--] = '0';
                charArray[secondIndex--] = '2';
                charArray[secondIndex] = '%';
            }
            index--;
        }

        return charArray; // All characters are unique
    }

    public static void main(String[] args) {
        String input1 = "Mr John Smith    ";
        int input1TrueLength = 13;
        String input2 = "Mr John Smith Kline      ";
        int input2TrueLength = 19;

        System.out.println("Input: " + input1 + " Output: " + String.valueOf(urlify(input1.toCharArray(), input1TrueLength)));
        System.out.println("Input: " + input2 + " Output: " + String.valueOf(urlify(input2.toCharArray(), input2TrueLength)));
    }
}
