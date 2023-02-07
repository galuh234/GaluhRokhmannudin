package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_9 {
    /*8 main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner
        double[] numbers = new double[10]; // create array of length 10

        // prompt teh user to enter ten numbers
        System.out.print("The minimum number is: " + min(numbers));
    }

    /** method min returns the smallest element in an array of double values */
    public static double min(double[] array) {
        double min = array[0];
        for (double i: array) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
