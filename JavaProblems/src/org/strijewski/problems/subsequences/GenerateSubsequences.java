package org.strijewski.problems.subsequences;

import java.util.ArrayList;
import java.util.List;

// Generate ALL subsequences from a given string
// eg. "rsv" -> ["rsv", "sv", "rv", "rs", "v", "s", "v", ""]
// We go through the string one character at a time,
// at each character we either 1) keep it 2) discard it
public class GenerateSubsequences {

    private static void generateSubsequences(String input, String current, List<String> resultList) {
        // base case: if input length is zero, we have a subsequence
        if (input.length() == 0) {
            resultList.add(current);
        } else {
            // case 1. add the current character
            String currentCharacter = input.substring(0,1);
            generateSubsequences(input.substring(1), current+currentCharacter, resultList);
            // case 2. drop the current character
            generateSubsequences(input.substring(1), current, resultList);
        }
    }

    public static void main(String[] args) {
        List<String> resultList1 = new ArrayList<>();
        generateSubsequences("ayth", "", resultList1);
        System.out.println("Subsequences for 'aythfn': " + resultList1);

        List<String> resultList2 = new ArrayList<>();
        generateSubsequences("qwertyu", "", resultList2);
        System.out.println("Subsequences for 'qwertyu': " + resultList2);
    }
}