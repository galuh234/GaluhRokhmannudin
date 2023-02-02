package Chapter2_elementary.ujian;

import java.util.Scanner;

public class ujiCh2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1000 and 9999: ");
        int number = input.nextInt();

        // Hitung jumlah digit dalam hitungan bulat
        int lessThan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int thousand = number % 10;
        number /= 10;
        int sum = thousand + hundreds + tens + lessThan10;

        System.out.println("The sum of the digits is " + sum);
    }
}
