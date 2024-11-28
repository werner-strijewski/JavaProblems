package org.strijewski.problems.vowelCounter;

public class VowelCounter {
    public static int countVowels(String candidate) {
        // base case: length zero, return 0
        if (candidate.length() == 0) {
            return 0;
        } else {
            // recursive case: take off last char, count vowels in rest
            String lastChar = candidate.substring(candidate.length()-1).toLowerCase();
            String remainingString = candidate.substring(0, candidate.length()-1);
            if ("a".equals(lastChar) ||
                    "e".equals(lastChar) ||
                    "i".equals(lastChar) ||
                    "o".equals(lastChar) ||
                    "u".equals(lastChar)) {
                return 1 + countVowels(remainingString);
            } else {
                return countVowels(remainingString);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Number of vowels in 'myHouseIsMyHome': " + countVowels("myHouseIsMyHome"));
    }
}