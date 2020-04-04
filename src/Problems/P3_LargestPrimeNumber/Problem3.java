package Problems.P3_LargestPrimeNumber;

// Question
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

public class Problem3 {

    public static void main(String[] args) {
        long input = 600851475143L;
        long counter = 0;
        while(!isPrime(input)) {
            counter++;
            if (isPrime(counter)) {
                while (input % counter == 0) {
                    input = input/counter;
                    if (isPrime(input)) {
                        break;
                    }
                }
            }
        }
        System.out.println("Max Prime: " + input);
    }

    private static boolean isPrime(long number) {
        if (number == 1) {
            return false;
        }
        byte i = 1;
        for (int j = 2; j <= number; j++) {
            if (number % j == 0) {
                i++;
                if (i == 2 && j < number) {
                    return false;
                }
            }
        }
        return true;
    }

}
