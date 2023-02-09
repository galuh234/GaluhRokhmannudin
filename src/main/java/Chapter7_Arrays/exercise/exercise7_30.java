package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()];

        System.out.print("The listb has" + (isConsecutiveFour(values) ? " " : " no ") + "consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1])
                count++;

            if (count >= 4)
                return true;

            if (values[i] != values[i + 1])
                count = 1;
        }
        return false;
    }
}
