package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_5 {
    /** main methhod */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10];    // array of length 10;
        int num;                                // user input
        int count = 0;                          // number of distinct nmbers

        // prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            // test if num is distinct
            if (isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;                        // increment count
            }
        }

        // displays the number of distinct numbers and the
        //distinct numbers separated by exactly one space
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct number are");
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] > 0)
                System.out.print(" " + distinctNumbers[i]);
        }
        System.out.println();
    }

    /** method isDistinct returns true if number is not in array false otherwise */
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }

}
