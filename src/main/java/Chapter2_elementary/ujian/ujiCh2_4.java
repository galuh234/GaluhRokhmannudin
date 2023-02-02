package Chapter2_elementary.ujian;

import java.util.Objects;
import java.util.Scanner;

public class ujiCh2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan Anda dalam kg ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tingii badan Anda dalam cm ");

        double tinggi = input.nextDouble();
        System.out.print("Masukkan jenis kelamin Anda (L / P) ");
        String jk = input.next();

        double berat_ideal = 0;

        //  Rumus Borcha
        if (Objects.equals(jk, "L")) {
            berat_ideal = (tinggi - 100) - (0.1 * (tinggi - 100));
        } else if (Objects.equals(jk, "P")) {
            berat_ideal = (tinggi - 100) - (0.15 * (tinggi - 100));
            System.out.println("Mohon maaf masukkan Jenis kelamin dengan L / P");
        }

        // Rumus BMI
        double tinggiDalamM = tinggi / 100;
        double bmi = berat_ideal / (Math.pow(tinggiDalamM, 2));

        String keterangan;
        if (bmi < 18.5) {
            keterangan = "Anda termasuk kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            keterangan = "Selamat Berat Badan Anda Normal";
        } else if (bmi > 24.9 && bmi < 29.9) {
            keterangan = "Anda Kelebihan Berat Badan";
        } else {
            keterangan = "Warning Anda Sudah Obesitas";
        }

        System.out.println("Berat badan ideal Anda menurut rumus Borcha adalah : " + berat_ideal + " Kg");
        System.out.println("Nilai BMI Anda adalah " + String.format("%.2f", bmi) + " Menurut BMI Anda termasuk " + keterangan);
    }
}
