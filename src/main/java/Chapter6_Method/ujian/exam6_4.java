package Chapter6_Method.ujian;

import java.util.Scanner;

public class exam6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Slip Gaji Karyawan Bulan Februari 2023");
        System.out.println("---------------------------------------------------------------------");
        int ts = 2023;

        System.out.print("Nama karyawan    : ");
        String nama = input.nextLine();
        System.out.print("Status           : ");
        String status = input.nextLine();
        System.out.print("Jumlah anak      : ");
        double anak = input.nextDouble();
        System.out.print("Jarak Rmh-Kanor  : ");
        int jarak = input.nextInt();
        System.out.print("Jumlah Msk kerja : ");
        int masuk = input.nextInt();
        System.out.print("Tahun Masuk      : ");
        int tahun = input.nextInt();
        System.out.print("gaji pokok: ");
        int gaji = input.nextInt();
        int hari = masuk * 1000;
        int tk = ts - tahun;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Gaji pokok   |   T.Keluarga      |  T.Transportasi    |  T.Kesehatan ");
        System.out.println("---------------------------------------------------------------------");
        System.out.print(gaji);
        System.out.print("     |    ");
        tunjangankeluarga(status, anak, gaji);
        tunjanganTranfortasi(jarak, hari);
        tunjanganKesehatan(tk, gaji);


    }
    public static void tunjangankeluarga(String statush,
                                         double anak, int gaji) {
        switch (statush) {
            case "Sudah menikah":
                if (anak == 0) {
                    System.out.print(gaji * 0.05);
                } else if (anak >= 1 && anak <= 3) {
                    System.out.print(gaji * 0.075);
                } else if (anak > 3) {
                    System.out.print(gaji * 0.1);
                }
                break;
            case "duda":
                if (anak == 0) {
                    System.out.print(gaji * 0.03);
                } else if (anak > 0) {
                    System.out.print(gaji * 0.05);
                }
                break;
            case "janda":
                if (anak == 0) {
                    System.out.print(gaji * 0.05);
                } else if (anak > 0) {
                    System.out.print(gaji * 0.075);
                }
                break;
            case "single":
                System.out.print(0);
                break;
        }
        System.out.print("      |      ");
    }
    public static void tunjanganTranfortasi(int jarak, int hari) {
        if (jarak <= 4)
            System.out.print(5000 * hari);
        else if (jarak >= 5 && jarak <= 10)
            System.out.print(10.000 * hari);
        else if (jarak > 10)
            System.out.print(15.000 * hari);
        System.out.print("       |      ");
    }
    public static void tunjanganKesehatan(int tk, int gaji) {
        if (tk < 2)
            System.out.println(200000 );
        else if (tk >= 2 && tk <= 5)
            System.out.println(500000 );
        else if (tk > 5)
            System.out.println(750000 );
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total Gaji Bulan Februari : " + gaji);
        System.out.println("---------------------------------------------------------------------");
    }
}
