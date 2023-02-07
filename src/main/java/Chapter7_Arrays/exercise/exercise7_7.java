package Chapter7_Arrays.exercise;

public class exercise7_7 {
        /** main method */
        public static void main(String[] args) {
                int[] counts = new int[10]; // array of ten integers

                // store the counts of 100 random numbers
                for (int i = 1; i <= 100; i++) {
                        counts[(int)(Math.random() * 10)]++;
                }

                // display the results
                System.out.println("Count for each number between 0 and 9:");
                for (int i = 0; i < counts.length; i++) {
                        System.out.println(i + "s; " + counts[i]);
                }
        }
}
