package Chapter5_loop.exercise;

public class exercise5_11 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;	// Number of numbers in each line displayed
        int count = 0; // Count the number divisible by 5 or 6, but not both

        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

