package Chapter6_Method.exercise;

import java.util.Scanner;

public class exercise6_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter the number of sides
        // and the side of a regular polygon
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Display the area of the regular polygon
        System.out.println("The area of the polygon is " + area(n, side));

    }

    /** Method area computes and returns the area of a regular polygon */
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
    }
}
