package org.strijewski.problems.stringCombinations;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
    private static void generateStringCombinations(String input, String current, int index, int targetLength, List<String> resultList) {
        // base case: current string is same length as desired length
        if (current.length() == targetLength) {
            resultList.add(current);
            return;
        }

        if (input.length() == index) {
            return;
        }

        // recursive case:
        // 1. include current character
        char currentChar = input.charAt(index);
        generateStringCombinations(input,  current + currentChar, index + 1, targetLength, resultList);
        // 2. drop current character
        generateStringCombinations(input, current, index + 1, targetLength, resultList);
    }

    public static void main(String[] args) {
        String input = "ABCDE";
        List<String> resultList = new ArrayList<>();
        int targetLength = 3;
        generateStringCombinations(input, "", 0, targetLength, resultList);
        System.out.println(targetLength + "-letter String Combinations of " + input + ":"+resultList);
    }

}
