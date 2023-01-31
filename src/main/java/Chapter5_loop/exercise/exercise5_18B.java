package Chapter5_loop.exercise;

public class exercise5_18B {
    public static void main(String[] args) {
        // Display pattern B
        System.out.println("Pattern B");
        for (int r = 6; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
