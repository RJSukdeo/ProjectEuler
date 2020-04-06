package Problems.P7_Prime10001;

import java.util.ArrayList;
import java.util.List;

//Question
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

// Note
// If divisible by any already discovered primes then number cannot be prime.
// If not divisible by any discovered primes you can start the exhaustive search at the highest prime + 1.
public class Problem7 {

    private static final int MAX_NO_PRIMES = 10001;
    private static final List<Integer> PRIMES = new ArrayList<>(MAX_NO_PRIMES);

    public static void main(String[] args) {
        int counter = 3;
        PRIMES.add(2);
        while (PRIMES.size() < MAX_NO_PRIMES) {
            if (isPrime(counter)) {
                PRIMES.add(counter);
            }
            counter+=2;
        }
        System.out.println("10001 prime number: " + PRIMES.get(PRIMES.size() - 1));
    }

    private static boolean isPrime(int input) {
        if (input == 0 || input == 1) {
            return false;
        }
        if (!PRIMES.isEmpty() && isDivisibleByKnownPrimes(input)) {
            return false;
        }
        int startCounter = PRIMES.isEmpty() ? 2: PRIMES.get(PRIMES.size() - 1) + 1;
        for (int i = startCounter; i <= input; i++) {
            if ((input % i == 0) && (i != input)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDivisibleByKnownPrimes(int input ) {
        for (Integer prime : PRIMES) {
            if (input % prime == 0) {
                return true;
            }
        }
        return false;
    }

}
