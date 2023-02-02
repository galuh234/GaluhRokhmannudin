package Chapter2_elementary.ujian;

import java.util.Scanner;

public class ujiCh2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai rupiah: ");
        double rupiah = input.nextDouble();
        double dollar = rupiah / 15665.50;
        System.out.print("rupiah adalah: ");
        System.out.printf(" %.2f", dollar);
        System.out.print("dollar");
    }
}
