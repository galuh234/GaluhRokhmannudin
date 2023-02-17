package Chapter8_MultidimensionalAyyays.exercise;

import java.util.Scanner;

public class exercise8_26 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        double[][] sortedMatrix = sortRows(matrix);

        System.out.println("\nThe row-sorted array is");
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix.length; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }

    public static double[][] sortRows(double[][] m)  {
        double[][] s = new double[m.length][m[0].length];
        copyMatrix(m, s);

        for (int row = 0; row < s.length; row++) {
            for (int col = 0; col < s.length - 1; col++) {
                double min = s[row][col];
                int index = col;
                for (int j = col + 1; j < s.length; j++) {
                    if (min > s[row][j]) {
                        min = s[row][j];
                        index = j;
                    }
                }
                if (index != col) {
                    s[row][index] = s[row][col];
                    s[row][col] = min;
                }
            }
        }
        return s;
    }

    public static void copyMatrix(double[][] original, double[][] copy) {
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
    }
}
