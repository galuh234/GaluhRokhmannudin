package Chapter2_elementary.exercise;

import java.util.Scanner;

public class exercise2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Hitung jumlah digit dalam hitungan bulat
        int lessThan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;

        System.out.println("The sum of the digits is " + sum);
    }
}
