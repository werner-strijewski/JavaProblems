package org.strijewski.problems.generatePermutations;

// Given a string, print all possible permutations of its characters.
// For example:
// Input: ABC
// Output:
// ABC
// ACB
// BAC
// BCA
// CAB
// CBA

// Approach:
// Fix the first character of the string and recursively find permutations of the remaining substring.
// Swap the fixed character with each of the remaining characters to generate new permutations.
// Use backtracking to restore the string's original order for subsequent recursive calls.
public class GeneratePermutations {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + ":");
        generatePermutations(str, 0, str.length() - 1);
    }

    public static void generatePermutations(String str, int start, int end) {
        // base case: start equals end
        if (start == end) {
            System.out.println(str);
            return;
        }

        for (int i = start; i <= end; i++) {
            str = swap(str, start, i);
            generatePermutations(str, start+1, end);
            str = swap(str, start, i);
        }
    }

    // Helper function to swap characters in a string
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
