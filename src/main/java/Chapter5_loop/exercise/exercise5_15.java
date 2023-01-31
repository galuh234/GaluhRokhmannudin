package Chapter5_loop.exercise;

public class exercise5_15 {
    public static void main(String[] args) {
        // Number of characters per line
        final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
        int count = 0;	// Count the number of characters

        // Print the ASCII characters from ! to ~
        for (int i = 33; i <= 126; i++) {
            count++;	// Increment count
            // Display 10 characters per line
            if (count % 10 == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i + " ");
        }
        System.out.println();
    }
}
