package org.strijewski.problems.subsequences;

import java.util.ArrayList;
import java.util.List;

// Generate ALL subsequences from a given string
// eg. "rsv" -> ["rsv", "sv", "rv", "rs", "v", "s", "v", ""]
// We go through the string one character at a time,
// at each character we either 1) keep it 2) discard it
public class GenerateSubsequences {

    static void generateSubsequences(String input, String current, List<String> result) {
        // base case: input string is zero length, so we add the current string to the result list
        if (input.length() == 0) {
            result.add(current);
        } else {
            // decision 1: keep current character
            String nextCharacter = input.substring(0, 1);
            generateSubsequences(input.substring(1), current + nextCharacter , result);
            // decision 2: discard current character
            generateSubsequences(input.substring(1), current, result);
        }
    }
    public static void main(String[] args) {
        List<String> resultList1 = new ArrayList<>();
        generateSubsequences("aythfn", "", resultList1);
        System.out.println("Subsequences for 'aythfn': " + resultList1);

        List<String> resultList2 = new ArrayList<>();
        generateSubsequences("qwertyu", "", resultList2);
        System.out.println("Subsequences for 'qwertyu': " + resultList2);
    }
}