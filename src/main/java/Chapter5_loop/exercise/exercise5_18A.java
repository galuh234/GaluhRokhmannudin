package Chapter5_loop.exercise;

import static java.lang.System.out;

public class exercise5_18A {
    public static void main(String[] args) {
        // Pattern A
        out.println("Pattern A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                out.print(cols + " ");
            }
            out.println();
        }
    }
}
