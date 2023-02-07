package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_8 {
    /** main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10]; // array of length 10

        // prompt the user to enter ten double values
        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        // display the average value
        System.out.println("The average value: " + average(values));
    }

    /* overloaded method average accepts an integer array and returns its average */
    public static int average(int[] array) {
        int average = 0;
        for (int i: array)
            average += i; // add indexed value to avverage
        return average / array.length;
    }

    /* overloaded method average accepts an integer array and returns its average */
    public static double average(double[] array) {
        double average = 0;
        for (double i: array)
            average += i; // add indexed value to average
        return average / array.length;
    }
}
