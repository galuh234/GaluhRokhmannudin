package Chapter6_Method.ujian;

import java.util.Scanner;

public class exam6_1 {
    public static void main(String[] args) {
        System.out.println("\nInch    Meter     |     meter       Inch");
        System.out.println("---------------------------------------------");

        for (double inch = 1.0, meter = 1.0; inch <= 100.0;
             inch++, meter ++) {
            System.out.printf("%4.1f  ", inch);
            System.out.printf("%6.4f", kemeter(inch));
            System.out.print("      |      ");
            System.out.printf("%-11.1f", meter);
            System.out.printf("%7.4f\n", keinch(meter));
        }
    }
    public static double kemeter(double inci) {
        return 0.0254 * inci;
    }
    public static double keinch(double meters) {
        return 39.3701 * meters;
    }

}
