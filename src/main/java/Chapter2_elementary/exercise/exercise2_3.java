package Chapter2_elementary.exercise;

import java.util.Scanner;

public class exercise2_3 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create constant value
        final double METERS_PEER_FOOT = 0.305;

        // Prompt user to enter a number in feet
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        // Convert feet into meters
        double meters = feet * METERS_PEER_FOOT;

        // Display results
        System.out.println(feet + " feet is " + meters + " meters");

    }
}
