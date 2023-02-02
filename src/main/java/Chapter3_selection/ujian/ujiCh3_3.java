package Chapter3_selection.ujian;

import java.util.Scanner;

public class ujiCh3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double jasa1 = 10000;
        final double jasa2 = 20000;
        final double jasa3 = 30000;

        System.out.println("Nama sales: ");
        String nama = input.nextLine();
        System.out.println("Masukan jumlah penjualan sales hari ini: ");
        double jumlah = input.nextDouble();

        double komisi1 = jumlah * 0.10;
        double komisi2 = jumlah * 0.15;
        double komisi3 = jumlah * 0.20;

        System.out.println("==========================================================");

        if (jumlah <= 200000)
            System.out.print("\nNama Sales " + nama + "\nSelamat, total penjualan anda hari ini adalah " + String.format("%.0f", jumlah) + "" +
                    " \nanda berhak mendapatkan komisi " + String.format("%.0f", komisi1) + " dan uang jasa " + String.format("%.0f", jasa1) +
                    " \nTotal pendapatan anda hari ini adalah " +String.format("%.0f", (jasa1 + komisi1)));
        else if (jumlah <= 500000)
            System.out.print("\nNama Sales " + nama + "\nSelamat, total penjualan anda hari ini adalah " + String.format("%.0f", jumlah) + "" +
                    " \nanda berhak mendapatkan komisi " + String.format("%.0f", komisi2) + " dan uang jasa " + String.format("%.0f", jasa2) + "" +
                    " \nTotal pendapatan anda hari ini adalah " + String.format("%.0f", (jasa2 + komisi2)));
        else if (jumlah > 500000)
            System.out.print("\nNama Sales " + nama + "\nSelamat, total penjualan anda hari ini adalah " + String.format("%.0f", jumlah) +
                    " \nanda berhak mendapatkan komisi " + String.format("%.0f", komisi3) + " dan uang jasa " + String.format("%.0f", jasa3) + "" +
                    " \nTotal pendapatan anda hari ini adalah " + String.format("%.0f", (jasa3 + komisi3)));
    }
}
