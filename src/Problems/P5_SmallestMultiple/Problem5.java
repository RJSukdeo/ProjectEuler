package Problems.P5_SmallestMultiple;

//Question
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

// Note
// Do not need divisors below 11, larger numbers (11....20) are composed of the numbers (1...10).

public class Problem5 {

    private static final int[] DIVISORS = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};;

    // In order for the number to be divisible by two, it must be even, hence traversing over even numbers.
    public static void main(String[] args) {
        int counter = 2;
        while(true) {
            if (isDivisible(counter)) {
                break;
            }
            counter += 2;
        }
        System.out.println("Smallest Divisor: " + counter);
    }

    private static boolean isDivisible(int input) {
        for (int divisor : DIVISORS) {
            if (input % divisor != 0) {
                return false;
            }
        }
        return true;
    }

}
