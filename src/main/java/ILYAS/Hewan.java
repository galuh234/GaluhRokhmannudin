package ILYAS;

public class Hewan {
    double tinggi = 20;
    double berat = 4;

    int umur;

    Hewan(int umur) {
        this.umur = umur;
    }

    void lari() {
        System.out.println("Berlari dengan sangat cepat.");
    }
        void jalan() {
            System.out.println("Berjalan sambil melompat.");
        }
        void makan(){
        System.out.println("Makan wortel dengan menggunakan mulutnya");
        }

    int getUmur() {
        return umur;
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }
}


class Kelinci {
    public static void main(String[] args) {

        Hewan kelinci = new Hewan(4);
        kelinci.makan();
        kelinci.jalan();
        kelinci.lari();

        System.out.println("Umur Kelinci adalah " + kelinci.getUmur() + " tahun");
        double bmi = kelinci.getBerat() / ((kelinci.getTinggi() * 0.01) * (kelinci.getTinggi() * 0.01));

        // Hasilnya
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
}

