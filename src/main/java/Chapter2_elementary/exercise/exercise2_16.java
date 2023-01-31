package Chapter2_elementary.exercise;

import java.util.Scanner;

public class exercise2_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of a hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Compute the area of the hexagon
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

        // Display result
        System.out.println("The area of the hexagon is " + area);
    }
}
