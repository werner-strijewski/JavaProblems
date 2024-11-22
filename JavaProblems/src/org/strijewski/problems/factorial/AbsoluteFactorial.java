package org.strijewski.problems.factorial;

public class AbsoluteFactorial {
    // factorial function
    public static int computeFactorial(int number) {
        // We are using ints as input. Thee are rather limited in range, so the maximum int we can handle
        // is 16.
        if (number > 16) {
            throw new IllegalArgumentException("The number input is greater than 16.");
        } else if (number < -16) {
            throw new IllegalArgumentException("The number input is less than -16.");
        }

        // We are allowing negative input and computing the factorial of the absolute value, and keeping the sign
        boolean isNegative = number < 0;
        number = Math.abs(number);

        int result = 1;

        for (int i = 2; i <= number; i++) {
            result = result * i;
        }

        return isNegative ? (-1 * result) : result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of -16 is: " + computeFactorial(-16));
        System.out.println("Factorial of 0 is: " + computeFactorial(0));
        System.out.println("Factorial of 1 is: " + computeFactorial(1));
        System.out.println("Factorial of 16 is: " + computeFactorial(16));

        try {
            System.out.println("Factorial of 17 is: " + computeFactorial(17));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: "+e.getMessage());
        }

        try {
            System.out.println("Factorial of -17 is: " + computeFactorial(-17));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: "+e.getMessage());
        }
    }
}
