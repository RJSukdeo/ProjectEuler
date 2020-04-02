package Problems.Problem1;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    // Question
    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //
    // Find the sum of all the multiples of 3 or 5 below 1000.

    public static void main(String[] args) {
        int max = 1000;
        Set<Integer> multiples = new HashSet<>();
        int counter = 0;
        int multThree = 0;
        int multFive = 0;
        int sum = 0;
        while ((multThree < max || multFive < max)) {
            multThree = counter * 3;
            multFive = counter * 5;
            if (multThree < max && multiples.add(multThree)) {
                sum += multThree;
            }
            if (multFive <max && multiples.add(multFive)) {
                sum += multFive;
            }
            counter++;
        }
        System.out.println("Sum of multiples of 3 and 5 below 1000: " + sum);
    }

}
