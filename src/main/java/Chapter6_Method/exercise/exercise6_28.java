package Chapter6_Method.exercise;

public class exercise6_28 {
    /** Main Method */
    public static void main(String[] args) {
        // Display table header
        System.out.println("\np           2^p-1");
        System.out.println("--------------------");

        // Display all Mersenne primes with p <= 31
        for (int p = 2; p <= 31; p++) {
            if (PrimeNumberMethod.isPrime(p)) {
                System.out.printf("%-13d", p);
                System.out.println(mersennePrime(p));
            }
        }
    }

    /** Method mersennePrime finds ans returns the mersenne prime of num*/
    public static int mersennePrime(int num) {
        return (int)Math.pow(2, num) - 1;
    }

    public class PrimeNumberMethod {
        public static void main(String[] args) {
            System.out.println("The first 50 prime numbers are \n");
            printPrimeNumbers(50);
        }

        public static void printPrimeNumbers(int numberOfPrimes) {
            final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
            int count = 0; // Count the number of prime numbers
            int number = 2; // A number to be tested for primeness

            // Repeatedly find prime numbers
            while (count < numberOfPrimes) {
                // Print the prime number and increase the count
                if (isPrime(number)) {
                    count++; // Increase the count

                    if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                        // Print the number and advance to the new line
                        System.out.printf("%-5s\n", number);
                    }
                    else
                        System.out.printf("%-5s", number);
                }

                // Check whether the next number is prime
                number++;
            }
        }

        /** Check whether number is prime */
        public static boolean isPrime(int number) {
            for (int divisor = 2; divisor <= number/2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    return false; // Number is not a prime
                }
            }

            return true; // Number is prime
        }
    }
}
