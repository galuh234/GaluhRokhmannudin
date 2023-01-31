package Chapter5_loop.exercise;

public class exercise5_18C {
    public static void main(String[] args) {
        // Display pattern C
        int numberOfLines = 6;
        System.out.println("Pattern C");
        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int col = rows; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
