package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_10 {
    /** mian method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; // create an array of length ten

        // prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // display the samllest value
        System.out.println("The minimum number is " + numbers[indexOfSmallestElement(numbers)] + " index " + indexOfSmallestElement(numbers));
    }

    /** method indexOfSmallestElement returns the index of
     * *   the smallest element in an array of integers */
    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1)
            return 0;

        double min = array[0];
        int minimumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }
}
