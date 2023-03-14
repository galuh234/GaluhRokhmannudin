package Chapter8_MultidimensionalAyyays.ujian;

import java.util.Scanner;

public class f {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program plikasi rekap nilai");

        System.out.println("Masukan jumlah siswa: ");
        String[] jumlahsiswa = new String[input.nextInt()];
        System.out.println("Masukan jumlah mapel: ");
        String[] jumlahmapel = new String[input.nextInt()];
        int[] nilai = new int[jumlahmapel.length];

        System.out.println("INPUT MATA PELAJARAN");
        for (int i = 0; i < jumlahmapel.length; i++) {
            System.out.println("Mata pelajaran " + (i + 1) + ": ");
            jumlahmapel[i] = input.next();
        }
        System.out.println("INPUT SISWA DAN NILAI SETIAP MATA PELAJARAN *");
        for (int i = 0; i < jumlahsiswa.length; i++) {
            System.out.println("Nama siswa " + (i + 1) + ": ");
            jumlahsiswa[i] = input.next();
            for (int j = 0; j < nilai.length; j++) {
                System.out.println("\nNilai mata pelajaran " + jumlahmapel[j] + ": ");
                nilai[i] = input.nextInt();
            }
        }

        System.out.println("*** DATA NILAI SISWA ***");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.format("%-3s | %-10s |", "No", "Nama Siswa");
        for (int i = 0; i < jumlahmapel.length; i++)
            System.out.printf(" %-10s | ", jumlahmapel[i]);
        System.out.printf("%-12s | %-5s | %-20s |", "Rata-rata", "Index", "Keterangan");
        System.out.println("\n---------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahsiswa.length; i++)
            System.out.printf("\n" + (i + 1) + "  |");

        for (int i = 0; i < jumlahsiswa.length; i++)
            System.out.printf(" " + jumlahsiswa[i]);
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------");


    }


    public static int indexnilai(int nilai, int index) {
        if (nilai >= 80) {
            index = 'A';
        } else if (nilai >= 70) {
            index = 'B';
        } else if (nilai >= 60) {
            index = 'C';
        } else if (nilai >= 50) {
            index = 'D';
        } else if (nilai <= 49) {
            index = 'E';
        } else
            System.out.println("Error");

        return index;
    }
}
