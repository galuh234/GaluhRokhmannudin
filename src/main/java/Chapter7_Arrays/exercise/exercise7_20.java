package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length ; i++)
            numbers[i] = input.nextDouble();

        selectionSort(numbers);

        for (double e: numbers)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i >=0; i--) {

            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
