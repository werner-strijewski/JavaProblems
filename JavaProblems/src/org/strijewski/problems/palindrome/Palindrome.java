package org.strijewski.problems.palindrome;

// abcdcba is a palindrome
// 0123456
// leftIndex = 0
// rightIndex = 6
// verify characters at end and beginning are the same, work inwards
public class Palindrome {

    public static boolean isPalindrome(String input, int leftIndex, int rightIndex) {
        // base case: leftIndex >= rightindex, we have a palindrome
        if (leftIndex >= rightIndex) {
            return true;
        } else { // if (leftIndex < rightIndex)
            if (input.charAt(leftIndex) == input.charAt(rightIndex)) {
                return isPalindrome(input.substring(1, input.length() - 1), 0, input.substring(1, input.length() - 1).length() - 1);
            } else {
                return false; // no palindrome
            }
        }
    }

    public static void main(String[] args) {
        String input = "myHome";
        System.out.println("Is " + input + " a palindrome : " + isPalindrome(input, 0, input.length() - 1));
        String input2 = "myHomeemoHym";
        System.out.println("Is " + input2 + " a palindrome : " + isPalindrome(input2, 0, input2.length() - 1));
        String input3 = "asdfghjkllkjhgfdsa";
        System.out.println("Is " + input3 + " a palindrome : " + isPalindrome(input3, 0, input3.length() - 1));
    }
}
