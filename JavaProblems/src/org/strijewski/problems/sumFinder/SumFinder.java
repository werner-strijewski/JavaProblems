package org.strijewski.problems.sumFinder;

public class SumFinder {
    private static int findSum(int number) {
        if (number < 10) {
            // base case: if the number is less than 10, we return it
            return number;
        } else {
            // recursive case: add the last digit to the sum of the rest of the digits
            int lastDigit = number % 10;
            return lastDigit + findSum((number - lastDigit) / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println("FindSum for 555: " + findSum(555));
        System.out.println("FindSum for 1122: " + findSum(1122));
        System.out.println("FindSum for 334: " + findSum(334));
    }
}
