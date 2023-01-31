package Chapter5_loop.exercise;

import java.util.Scanner;

public class exercise5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        // Convet decimal to octal
        String octal = "";							// Hold octal value
        for (int i = decimal; i > 0; i /= 8) {
            octal = i % 8 + octal;
        }

        // Display results
        System.out.println("The octal of " + decimal + " is " + octal);
    }
}
