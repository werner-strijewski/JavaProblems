package org.strijewski.problems.fibonacci;

// The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
// The sequence starts as:
//0, 1, 1, 2, 3, 5, 8, 13, ...

//The formula for the nth Fibonacci number is:
//F(n)=F(n−1)+F(n−2)

//With base cases:
//F(0)=0,F(1)=1
public class Fibonacci {

    private static int calculateFibonacci(int number) {
        if (number == 0) { // base case 1: F(0) = 0
            return 0;
        } else if (number == 1) { // base case 2: F(1) = 1
            return 1;
        } else { // recursive case: factorial of number-1
            return calculateFibonacci(number-1) + calculateFibonacci(number-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci for 5: " + calculateFibonacci(5));
        System.out.println("Fibonacci for 6: " + calculateFibonacci(6));
        System.out.println("Fibonacci for 7: " + calculateFibonacci(7));
        System.out.println("Fibonacci for 8: " + calculateFibonacci(8));
    }

}
