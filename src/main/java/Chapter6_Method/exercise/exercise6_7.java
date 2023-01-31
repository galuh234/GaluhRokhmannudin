package Chapter6_Method.exercise;

import java.util.Scanner;

public class exercise6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        final int NUMBER_OF_YEARS = 30; // Number of years to display

        // Prompt the user to enter the investment amount and interest rate
        System.out.print("\nThe amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Get monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Print a table that displays future value for the years from 1 to 30
        System.out.println("Years     Future Value"); // Table header
        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n",
                    futureInvestmentValue(amount, monthlyInterestRate, years));
        }
    }

    /** Method futureInvestmentValue computes future investement value */
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
