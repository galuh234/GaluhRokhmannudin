package Chapter5_loop.exercise;

public class exercise5_13 {
    public static void main(String[] args) {
        int n = 0; 	// Intialize n at 0;

        // Find the largest n such that n^3 is < 12,000
        while (Math.pow(n + 1, 3) < 12000) {
            n++; 		// Increment n
        }

        // Display result
        System.out.println("Largest integer n such that n^3 is less than 12,000: " + n);
    }
}
