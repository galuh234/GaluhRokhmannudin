package Chapter2_elementary.exercise;

import java.util.Scanner;

public class exercise2_1 {
    public static void main(String[] args) {

        // Create new Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to input a double
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double Fahrenheit = 9.0 / 5 * celsius + 32;

        // Display results
        System.out.println(celsius + " Celsius is " + Fahrenheit
                + " Fahrenheit");

    }
}
