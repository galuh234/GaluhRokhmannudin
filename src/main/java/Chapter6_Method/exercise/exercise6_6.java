package Chapter6_Method.exercise;

import java.util.Scanner;

public class exercise6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int numberOfRows = input.nextInt();

        // Display pattern
        displayPattern(numberOfRows);
    }

    /** displayPattern Method */
    public static void displayPattern(int n) {
        int padding = n - 1;	// Holds number of whitespace
        for (int r = 1; r <= n; r++) {
            // Print padding
            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            padding--; // Decrement padding
        }

    }
}
