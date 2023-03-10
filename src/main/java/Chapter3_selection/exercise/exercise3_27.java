package Chapter3_selection.exercise;

import java.util.Scanner;

public class exercise3_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 	// Create a Scanner object

        // Prompt the user to enter a point with x and y coordinates
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Determine whether the point is inside the triangle
        // getting the point of ina line that starts at point

        // Get the intersecting point with the hypotenuse side of the triangle
        // of a line that starts and points (0, 0) and touches the user points
        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

        // Display results
        System.out.println("The point " + ((x > intersectx || y > intersecty)
                ? "is not " : "is " ) + "in the triangle");
    }
}
