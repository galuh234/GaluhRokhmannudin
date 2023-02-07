package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_3 {
    /** main method*/
    public static void main(String[] args) {
        int[] counts = new int[100]; // counts the occurrences of numbers

        // prompt the user to enter integers between 1 and 100
        System.out.print("Enter the integers between 1 and 100: ");

        // count occurrence of numbers
        counts(counts);

        // display result
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
        }
    }

    /** method count reads integers between 1 and 100 * and count the occurrences of each */
    public static void counts(int[] counts){
        Scanner input = new Scanner(System.in);
        int num; // holds user input
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100)
                counts[num - 1]++;
        } while (num != 0);
    }
}
