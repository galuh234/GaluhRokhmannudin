package Chapter6_Method.latihan;

public class listing6_7 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }
    public static void printPrimeNumbers(int numberOfPrime) {
        final int NOPPL = 10;
        int count = 0, number = 2;
        while (count < numberOfPrime) {
            if (isPrime (number)) {
                count++;
                if (count % NOPPL == 0) {
                    System.out.printf("%-5s\n", number);
                }
                else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
