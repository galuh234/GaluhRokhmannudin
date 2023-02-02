package Chapter2_elementary.ujian;

import java.util.Scanner;

public class ujiCh2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan alas segitiga: ");
        double as = input.nextDouble();
        System.out.print("Masukan tinggi segitiga: ");
        double ts = input.nextDouble();
        System.out.print("Masukan Tinggi prisma: ");
        double TP = input.nextDouble();

        double ks = 2 * Math.pow(Math.pow(as / 2, 2) + Math.pow(ts, 2), 0.5) + as;
        double volume = ((1 * as * ts) / 2) * TP;
        double luasPermukaan = (2 * 1 / 2 * as * ts) + (ks * TP);
        System.out.println("Luas permukaan " + String.format("%.2f", luasPermukaan) + "dan besar volumenya adalah " + volume);
    }
}