package Chapter8_MultidimensionalAyyays.ujian;

import java.util.Scanner;

public class Datanilaimhs {
    public static void main(String[] args) {
        System.out.println("Program aplikasi nilai siswa");

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa");
        String[] siswa = new String[input.nextInt()];

        System.out.println("Masukkan jumlah mata pelajaran");
        String[] mapel = new String[input.nextInt()];

        System.out.println("Input mata pelajaran");
        for (int i = 0; i < mapel.length; i++) {
            System.out.print("Masukkan mata pelajaran ke- " + (i + 1) + ": ");
            mapel[i] = input.next();
        }

        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Masukkan siswa ke- " + (i + 1) + ": ");
            siswa[i] = input.next();
        }

        int nilai = 0;
        if (nilai >= 80 && nilai <=100){
            System.out.println('A');
        }
        else if (nilai > 70 && nilai < 79){
            System.out.println('B');
        }
        else if (nilai > 60 && nilai < 69){
            System.out.println('C');
        }
        else if (nilai > 50 && nilai < 59){
            System.out.println('D');
        }

        else {
            System.out.println('E');
        }

        char nilaiKual = 'A';
        if (nilaiKual == 'A'){
            System.out.println("\n"+siswa+" dengan mata pelajaram "+mapel+" memiliki nilai akhir "+nilai+" = ("+nilaiKual +")"+""
                    + "\n dan dinyatakan Lulus dengan pujian");
        }
        else if (nilaiKual == 'B') {
            System.out.println("\n" + siswa + " dengan mata pelajaram " + mapel + " memiliki nilai akhir " + nilai + " = (" + nilaiKual + ")" + ""
                    + "\n dan dinyatakan Lulus");
        }
        else if (nilaiKual == 'C') {
            System.out.println("\n" + siswa + " dengan mata pelajaram " + mapel + " memiliki nilai akhir " + nilai + " = (" + nilaiKual + ")" + ""
                    + "\n dan dinyatakan Lulus");
        }
        else if (nilaiKual == 'D'){
            System.out.println("\n"+ siswa +" dengan mata pelajaram "+ mapel +" memiliki nilai akhir "+ nilai +" = ("+ nilaiKual+")"+""
                    + "\n dan dinyatakan Lulus dengan pertimbangan");
        }
        else if (nilaiKual == 'E'){
            System.out.println("\n"+siswa+" dengan mata pelajaran "+ mapel +" memiliki nilai akhir "+ nilai +" = ("+ nilaiKual +")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        }
    }
}
