package Problems.P4_LargestPalindromeProduct;

import java.util.ArrayList;
import java.util.List;

//Question
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

//Note there is a cool solution on the forums to test if a number is a palindrome, make it into a string, you reverse it and check if it is equal to the original string.

public class Problem4 {

    public static void main(String[] args) {
        int largestNum = 0;
        int min = 100;
        int max = 999;
        for (int i = min; i < max; i++) {
            for (int j = i; j <= max; j++) {
                int result = i * j;
                if (isPalindrome(result)) {
                    largestNum = Math.max(largestNum, result);
                }
            }
        }
        System.out.println("Largest three palindrome: " + largestNum);
    }

    private static boolean isPalindrome(int input) {
        List<Integer> digits = getDigits(input);
        for (int i = 0; i < digits.size() / 2; i++) {
            if (!digits.get(i).equals(digits.get(digits.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> getDigits(int input) {
        List<Integer> digits = new ArrayList<>(6);
        while (input > 9) {
            digits.add(input % 10);
            input = input /10;
        }
        digits.add(input);
        return digits;
    }

}
