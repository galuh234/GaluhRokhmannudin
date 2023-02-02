package Chapter6_Method.exercise;

import java.util.Scanner;

public class exercise6_26 {
    /** Main Method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Report whether the integer is a palindrome.
        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
                "a palindrome.");
    }

    /** Method isPalindrome returns true if number is a palindrome */
    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    /** Method reverse returns the reversal of an integer */
    public static int reverse(int number) {
        String reverse = ""; 	// Holds reversed number
        String n = number + ""; // Convert number to string
        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse); // Return reversed integer
    }

    public static class Exercise_06_26 { /** RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI - RUN DISINI **/
        /** Main Method */
        public static void main(String[] args) {
            // Number of palindromic prime numbers to display
            final int NUMBER_OF_PALINDROMIC_PRIMES = 100;
            final int NUMBERS_PER_LINE = 10; // Display 10 numbers per line

            int count = 0; // Counts the number of palindromic prime numbers
            int n = 2;	// Possible palindromic prime numbers

            // Display 10 numbers per line, separated by exactly one space
            while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
                if (isPalindromicPrime(n)) {
                    count++; // Increment count
                    System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
                }
                n++; // Increment index
            }
        }

        /** Method isPalindromicPrime returns true if number is a Prime and
         Palindrome. False otherwise */
        public static boolean isPalindromicPrime(int num) {
            return PrimeNumberMethod.isPrime(num) &&
                    exercise6_26.isPalindrome(num);
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
}
