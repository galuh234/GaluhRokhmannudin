package Chapter2_elementary.exercise;

import java.util.Scanner;

public class exercise2_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);	// Create a Scanner object

        // Prompt the user to the number of years
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // Calculate population projection
        int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
                + (31536000 / 45)) * years);

        // Display the results
        System.out.println("The population in " + years + " is " + population);
    }
}
