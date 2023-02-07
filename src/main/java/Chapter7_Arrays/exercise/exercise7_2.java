package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_2 {
    /** main method */
    public static void main(String[] args) {
        int[] array = new int[10];

        // prompt the user to enter ten integers
        System.out.print("Enter ten integers: ");

        // fill the array
        fill(array);

        // display integers in reserve order
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    /** method fill */
    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
    }
}
