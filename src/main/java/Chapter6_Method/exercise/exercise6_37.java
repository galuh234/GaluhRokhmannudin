package Chapter6_Method.exercise;

import java.util.Scanner;

public class exercise6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter a number and its width
        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();

        // Display a string of formatted number
        System.out.println(
                number + " formatted to width " + width + ": " + format(number, width));
    }

    /** Method format returns a string for the number with one or more prefix 0s */
    public static String format(int number, int width) {
        String num = number + ""; // String representation for the number

        // If the number is shorter than the width format
        // Else return the string representation for the number
        if (num.length() < width) {
            for (int i = width - num.length(); i > 0; i--) {
                num = 0 + num;
            }
        }
        return num;
    }
}
