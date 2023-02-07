package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        int[] distincNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinc numbers are:");
        for (int e: distincNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distincList = new int[list.length];
        int i = 0;
        for (int e: list) {
            if (linearSearch(distincList, e) == -1) {
                distincList[i] = e;
                i++;
            }
        }
        return distincList;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}
