package Chapter2_elementary.ujian;

import java.util.Scanner;

public class ujiCh2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak perjalanan dalam kilometer ");
        int jarak = input.nextInt();

        System.out.print("Masukkan konsumsi bahan bakar kendaraan ada dalam kilometer / liter");
        int konsumsi = input.nextInt();

        System.out.print("Masukkan harga bahan bakar dalam 1 liter ");
        int harga = input.nextInt();

        int total = jarak / konsumsi * harga;

        System.out.print("Maka total biaya perjalanan Anda dalam " + jarak + " km adalah Rp " + total);
    }
}
