package org.strijewski.problems.greatestCommonDivisor;

public class GreatestCommonDivisor {
    private static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }
    public static void main(String[] args) {
        System.out.println("greatestCommonDivisor of 15 and 45: " + greatestCommonDivisor(15, 45));
        System.out.println("greatestCommonDivisor of 150 and 45: " + greatestCommonDivisor(150, 45));
        System.out.println("greatestCommonDivisor of 150 and 4500: " + greatestCommonDivisor(150, 4500));
    }

}
