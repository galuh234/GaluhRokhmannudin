package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        // prompt the user to enter each students' names and thier scores
        System.out.println("Enter the name a score for each student:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }

        // sort student names in decreasing order of their scores
        sortDecreasing(students, scores);

        // display student name in decreasing order of thier scores
        for (String e: students) {
            System.out.println(e);
        }
    }

    /** sorts a string and integer array in decreasing order */
    public static void sortDecreasing(String[] strs, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int maxIndex = i;
            String temp;

            // find the minimum in the list[i..nums.length - 1]
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                // swap string array
                temp = strs[i];
                strs[i] = strs[maxIndex];
                strs[maxIndex] = temp;

                // swap int array
                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
    }
}
