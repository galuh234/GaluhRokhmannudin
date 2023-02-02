package Chapter3_selection.ujian;

import java.util.Scanner;

public class ujiCh3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Apakah pelanggan termasuk member: ");
        String pelanggan = input.nextLine();
        System.out.println("Masukan Total Belanja: ");
        double total = input.nextDouble();

        double PM = total * 0.02;
        double pm = total * 0.03;
        double ph = total * 0.02;
        double DM = total - PM;
        double dm = total - pm;
        double dh = total - ph;

        switch (pelanggan){
            case "Ya":
                System.out.print("Anda merupakan: Member");
                System.out.print("\nTotal Belanja Anda: " + String.format("%.0f", total));
                if (total <= 500000)
                    System.out.println("\nSelamat anda mendapatkan potongan harga " + PM +" \nTotal bayar: " + DM);
                else if (total > 500000)
                    System.out.println("\nSelamat anda mendapatkan potongan harga " + pm + "\nTotal bayar: " + dm); break;
            case "Tidak":
                System.out.print("Anda merupakan: Pelanggan biasa");
                System.out.print("\nTotal Belanja Anda: " + String.format("%.0f", total));
                if (total > 500000)
                    System.out.println("\nSelamat anda mendapatkan potongan harga " + ph + "\nTotal bayar: " + dh);
                else
                    System.out.println("\nTotal bayar: " + total); break;
        }
        System.out.println("\n*************** CASH SYSTEM ***************");
        System.out.println("\nTotal cash: ");
        int cash = input.nextInt();

        if (cash >= total)
            switch (pelanggan) {
                case "Ya":
                    if (cash <= 500000)
                        System.out.println("Kembalian anda: " + String.format("%.0f", cash - DM));
                    else if (cash > 500000)
                        System.out.println("Kembalian anda: " + String.format("%.0f", cash - dm));break;
                case "Tidak":
                    if (cash <= 500000)
                        System.out.println("Kembalian anda : " +  String.format("%.0f", cash - total));
                    else if (cash > 500000)
                        System.out.println("Kembalian anda: " + String.format("%.0f", cash - dh));
            }
        else if (cash < total)
            System.out.println("Mohon maaf jumlah uang yang anda bayarkan kurang");
    }
}
