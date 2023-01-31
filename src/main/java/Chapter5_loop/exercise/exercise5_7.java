package Chapter5_loop.exercise;

public class exercise5_7 {
    public static void main(String[] args) {
        int totalCost = 0;		// Accumulate total cost of four years tuition
        int tuition = 10000;
        int tuitionTenthYear = 0;

        for (int year = 1; year <= 14; year++) {
            // Increase tuition by 5% every year
            tuition += (tuition * 0.05);

            if (year > 10) // Test for after 10 years
                totalCost += tuition; // Accumulate tuition cost

            // Cost of tutiion in ten years
            if (year == 10)
                tuitionTenthYear = tuition;
        }

        // Display the cost of tuition in ten years
        System.out.println("Tuition in ten years: $" + tuitionTenthYear);

        // Display the cost of four years' worth of tuition after tenth year
        System.out.println("Total cost for four years' worth of tuition" +
                " after the tenth year: $" + totalCost);
    }
}
