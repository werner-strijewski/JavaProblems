package org.strijewski.problems.exponent;

public class Exponent {

    static int calculateExponent(int base, int exponent) {
        // base case: exponent 0, answer is 1
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculateExponent(base, exponent-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Exponent of base 2, exp 6: "+ calculateExponent(2, 6));
    }

}
