package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_4 {
    /** main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt ther user to enter an scores
        System.out.print("Enter scores: (negative number signifies end): ");

        int[] scores = new int[100];    // initialize score array
        int num;                        // hold user input
        int numberOfScores;             // number of scores
        int average;                    // average score
        numberOfScores = average = 0;   // initialize accumulator to 0;
        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0)                // a negative number signifies end
                break;

            scores[i] = num;            // fill scores array
            average += num;             // add scores to average
            numberOfScores++;           // increment number of scores
        }

        average /= numberOfScores;

        int aboveOrEqual;               // scores above or equal to average
        int below;                      // scores below average
        aboveOrEqual = below = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] >= average)
                aboveOrEqual++;         // increment aboveOrEqual
            else
                below++;                // increment below
        }

        // display result
        System.out.println("\nAverage of scores: " + average);
        System.out.println("Number of score above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);

    }
}
