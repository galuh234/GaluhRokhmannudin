package Chapter8_MultidimensionalAyyays.exercise;

import java.util.Scanner;

public class exercise8_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        char[][] square = new char[n][n];

        System.out.println("Enter 4 rows of letters separated by spaces:");
        initializeSquare(square);

        System.out.println("The array is" + (isLatinSquare(square) ? " " : " not ") + "a Latin square");
    }

    public static boolean isLatinSquare(char[][] s) {
        return isDistinctRow(s) && isDistinctColumn(s);
    }

    public static boolean isDistinctRow(char[][] s) {
        for (int i = 0; i < s.length; i++) {
            int[] counts = new int[s.length];
            for (int j = 0; j < s[i].length; j++) {
                counts[s[i][j] - 65]++;
                if (counts[s[i][j] - 65] > 1)
                    return false;
            }
        }
        return true;
    }

    public static boolean isDistinctColumn(char[][] s) {
        for (int i = 0; i < s.length; i++) {
            int[] counts = new int[s[0].length];
            for (int j = 0; j < s[i].length; j++) {
                counts[s[j][i] - 65]++;
                if (counts[s[j][i] - 65] > 1)
                    return false;
            }
        }
        return true;
    }

    public static void initializeSquare(char[][] square) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                String str = input.next();
                char ch = str.charAt(0);
                if (ch >= 'A' && ch < (char)('A' + square.length))
                    square[i][j] = ch;
                else {
                    System.out.println("Wrong input: the letters must be from A to " + (char)('A' + square.length - 1));
                    System.exit(1);
                }
            }
        }
    }
}
