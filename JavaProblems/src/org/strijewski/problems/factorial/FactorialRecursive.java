package org.strijewski.problems.factorial;

public class FactorialRecursive {

    private static int calculateFactorial(int number) {
        // base case: 0! = 1
        if (number == 0) {
            return 1;
        } else { // recursive case: factorial of number-1
            return number * calculateFactorial(number-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial for 5: " + calculateFactorial(5));
        System.out.println("Factorial for 6: " + calculateFactorial(6));
        System.out.println("Factorial for 7: " + calculateFactorial(7));
        System.out.println("Factorial for 8: " + calculateFactorial(8));
    }

}
