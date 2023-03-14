package Chapter8_MultidimensionalAyyays.ujian;

import java.util.Scanner;

public class DataNilaiSiswa {
    public static void main(String[] args) {

        String[] nama;
        String[] mapel;
        //double[][] nil;
        int n;
        int s;
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKAN DATA ");
        System.out.print("Jumlah Siswa : ");
        n = input.nextInt();
        nama = new String[n];
        System.out.print("Jumlah Mata Pelajaran: ");
        s = input.nextInt();
        input.nextLine();
        mapel = new String[s];
        double nilai;
        String grade = "";

        int[][] nil = new int[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Siswa ke-" + (i + 1) + ": \n");
            System.out.print("Nama = ");
            nama[i] = input.nextLine();

            int[][] sis = new int[s][3];
            for (int l = 0; l < s; l++) {
                System.out.print("Mata Pelajaran ke-" + (l + 1) + ": \n");
                System.out.print("Mata pelajaran = ");
                mapel[l] = input.nextLine();

                System.out.print("Nilai = ");
                nil[i][0] = input.nextInt();
                input.nextLine();
            }
            System.out.println(" MENAMPILKAN DATA NILAI SISWA");
            System.out.println(" Menggunakan Array 2 Dimensi");
            System.out.println("-------------------------------------------------------");
            System.out.println("NO\tNAMA\t" + mapel + "\tRATA-RATA\tGRADE\tKETERANGAN");
            System.out.println("-------------------------------------------------------");
            for (int i1 = 0; i < nama.length; i++) {
                System.out.print((i + 1) + "\t" + nama[i] + "\t");
                for (int j = 0; j < 3; j++) {
                    System.out.print(nil[i][j] + "\t");
                }

                nilai = 0.3 * nil[i][i1];
                if (nilai >= 80) grade = "A";
                else if (nilai >= 70) grade = "B";
                else if (nilai >= 60) grade = "C";
                else if (nilai >= 50) grade = "D";
                else if (nilai < 50) grade = "E";

                System.out.println(nilai + "\t" + grade);
            }
            char nilaiKual = 'A';
            if (nilaiKual == 'A'){
                System.out.println("\n"+n+" dengan mata pelajaram "+mapel+" memiliki nilai akhir "+nil+" = ("+nilaiKual +")"+""
                        + "\n dan dinyatakan Lulus dengan pujian");
            }
            else if (nilaiKual == 'B') {
                System.out.println("\n" + n + " dengan mata pelajaram " + mapel + " memiliki nilai akhir " + nil + " = (" + nilaiKual + ")" + ""
                        + "\n dan dinyatakan Lulus");
            }
            else if (nilaiKual == 'C') {
                System.out.println("\n" + n + " dengan mata pelajaram " + mapel + " memiliki nilai akhir " + nil + " = (" + nilaiKual + ")" + ""
                        + "\n dan dinyatakan Lulus");
            }
            else if (nilaiKual == 'D'){
                System.out.println("\n"+ n +" dengan mata pelajaram "+ mapel +" memiliki nilai akhir "+ nil +" = ("+ nilaiKual+")"+""
                        + "\n dan dinyatakan Lulus dengan pertimbangan");
            }
            else if (nilaiKual == 'E'){
                System.out.println("\n"+n+" dengan mata pelajaran "+ mapel +" memiliki nilai akhir "+ nil +" = ("+ nilaiKual +")"+""
                        + "\n dan dinyatakan Tidak Lulus");
            }

            System.out.println("-------------------------------------------------------");

        }

    }
}


