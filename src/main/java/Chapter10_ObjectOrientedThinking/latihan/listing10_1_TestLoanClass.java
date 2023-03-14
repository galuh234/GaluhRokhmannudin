package Chapter10_ObjectOrientedThinking.latihan;

import java.util.Scanner;

public class listing10_1_TestLoanClass {
    public listing10_1_TestLoanClass(double annualInterestRate, int numberOfYears, double loanAmount) {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        listing10_1_TestLoanClass loan = new listing10_1_TestLoanClass(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }

    private Object getTotalPayment() {
        return null;
    }

    private Object getMonthlyPayment() {
        return null;
    }

    private Object getLoanDate() {
        return null;
    }
}
