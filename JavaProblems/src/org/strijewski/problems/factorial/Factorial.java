package org.strijewski.problems.factorial;

import java.math.BigInteger;

public class Factorial {
    // Method to calculate a factorial value
    // use BigInteger to hold large value.
    public static BigInteger calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
        BigInteger factorial = new BigInteger("1");

        // 0! and 1! are 1, which is what we set the initial value to.
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }

    public static void main(String[] args) {
        final int number = -1;

        System.out.println("Factorial for "+number+": " + calculateFactorial(number));
    }
}
