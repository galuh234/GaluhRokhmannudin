package Chapter8_MultidimensionalAyyays.ujian;

import java.util.Scanner;

public class DataNilaiMhsw {
    public static void main(String[] args) {
        int[][] nil = new int[10][10];
        System.out.println("Program Alikasi Rekap Nilai Siswa");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        String[] jmlhsiswa = new String[input.nextInt()];

        System.out.print("Masukkan jumlah mata pelajaran: ");
        String[] mapel = new String[input.nextInt()];
        int[] nilai = new int[mapel.length];

        System.out.println("INPUT MATA PELAJARAN");
        for (int i = 0; i < mapel.length; i++) {
            System.out.println("Input mata pelajaran ke-" + (i + 1) + ": ");
            mapel[i] = input.next();
        }

        System.out.println("INPUT SISWA DAN NILAI SETIAP MATA PELAJARAN ");
        for (int i = 0; i < jmlhsiswa.length; i++) {
            System.out.println("Input nama siswa ke- " + (i + 1) + ": ");
            jmlhsiswa[i] = input.next();

            for (int j = 0; j < nilai.length; j++) {
                System.out.println("\nNilai mata pelajaran " + mapel[j] + ": ");
                nilai[i] = input.nextInt();
            }
        }

        System.out.println(" DATA NILAI SISWA ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.format("%-3s | %-10s |", "No", "Nama Siswa");
        for (int i = 0; i < mapel.length; i++)
            System.out.printf(" %-10s | ", mapel[i]);
        System.out.printf("%-12s | %-5s | %-20s |", "Rata-rata", "Index", "Keterangan");
        System.out.println("\n---------------------------------------------------------------------------------------");

        for (int i = 0; i < jmlhsiswa.length; i++)
            System.out.printf("\n" + (i + 1) + "  | " + jmlhsiswa[i]);

        for (int i = 0; i < jmlhsiswa.length; i++)
            System.out.printf(" ");
        System.out.println("\n---------------------------------------------------------------------------------------");

//      char index;
//            if(nilai >= 80) {
//                index="A" + "\t" + "Lulus dengan baik" ;
//            } else if(nilai >= 70) {
//                index ="B" + "\t" + "Lulus";
//            } else if(nilai >= 60) {
//                index ="C" + "\t" + "Lulus";
//            } else if(nilai >= 50) {
//                index="0" + "\t" + "Lulus dengan pertimbangan";
//            } else if(nilai < 50) {
//                index="E" + "\t" + "Tidak Lulus";
//            }
//
//            System.out.println(index + "\t");

    }
}









