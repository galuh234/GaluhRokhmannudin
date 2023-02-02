package Chapter3_selection.ujian;

import java.util.Scanner;

public class ujiCh3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Aplikasi Penialaian (Renatang nilai 0-100)");
        System.out.print("Massukan Nilai Kehadiran: ");
        double NK = input.nextDouble();
        System.out.print("Masukan Nilai Tugas: ");
        double NT = input.nextDouble();
        System.out.print("Masukan Niali UTS: ");
        double NUTS = input.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        double NUAS = input.nextDouble();
        System.out.print("Masukan nilai projek akhir: ");
        double NPA = input.nextDouble();

        double nilaiKehadiran = NK * 0.05;
        double nilaiTugas = NT * 0.20;
        double nilaiProjekAkhir = NPA * 0.30;
        double nilaiUTS = NUTS * 0.20;
        double nilaiUAS = NUAS * 0.25;
        double nilaiAkhir = nilaiKehadiran + nilaiTugas + nilaiProjekAkhir + nilaiUTS + nilaiUAS;
        String nilai;


        if (nilaiAkhir >= 90)
            nilai = " A ";
        else if (nilaiAkhir >= 85)
            nilai = " B+ ";
        else if (nilaiAkhir >= 80)
            nilai = " B ";
        else if (nilaiAkhir >= 75)
            nilai = " B- ";
        else if ( nilaiAkhir >= 70)
            nilai = " C+ ";
        else if (nilaiAkhir >= 65)
            nilai = " C ";
        else if (nilaiAkhir >= 60)
            nilai = " C- ";
        else if (nilaiAkhir >= 50)
            nilai = " D ";
        else
            nilai = " E ";

        if (nilaiAkhir >= 60)
            System.out.println("Selamat Anda Lulus dengan nilai" + nilai);
        else
            System.out.println("Nilai anda" + nilai + "dinyatakan Tidak Lulus \nAnda harus mengulang matakuliah ini");
    }
}
