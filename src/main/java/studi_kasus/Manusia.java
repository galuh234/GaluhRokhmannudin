package studi_kasus;

import java.util.Calendar;

/**
 *
 *
 */
abstract class Manusia {
    //Di dalam class abstrak Manusia,
    //Terdapat 2 atribut private
    private String namaLengkap;
    private int tahunLahir;

    //Konstruktor memiliki 2 parameter
    //untuk mengisi 2 variabel private di atas
    public Manusia(String namaLengkap, int tahunLahir){
        this.namaLengkap = namaLengkap;
        this.tahunLahir = tahunLahir;
    }

    //Method getter untuk mendapatkan nama lengkap
    protected String getNamaLengkap(){
        return namaLengkap;
    }

    //Method untuk menghitung umur
    //Method ini tidak akan terlihat di Child class
    protected int getUmur(){
        Calendar cal = Calendar.getInstance();

        int tahunSekarang = cal.get(Calendar.YEAR);

        return tahunSekarang-tahunLahir;
    }

    //Method menyapa adalah abstrak
    //Harus diimplementasikan oleh
    //turunan dari class Manusia
    public abstract void menyapa();
}

class Paijo extends Manusia{//Turunan dari class Manusia

    //Konstruktor yang memiliki 2 parameter,
    //Untuk memenuhi kebutuhan parameter yang ada
    //di class Manusia (Parent class-nya)
    public Paijo(String namaLengkap,int tahunLahir){
        //Passing 2 parameter ke class Manusia (Parent class-nya)
        super(namaLengkap,tahunLahir);

    }

    //- Mengimplementasikan method menyapa. -
    //Dalam method ini, dipanggil 2 method dari
    //Parent Class yaitu getNamaLengkap() dan getUmur()
    @Override
    public void menyapa() {
        System.out.println("Sugeng Rawuh, nama lengkapku "+getNamaLengkap()+
                ", umurku "+getUmur()+" tahun.");
    }

}

class Ratna extends Manusia{
    public Ratna(String namaLengkap, int tahunLahir){
        super(namaLengkap,tahunLahir);
    }

    //Mengimplementasikan method menyapa()
    //Berbeda dengan class Paijo
    @Override
    public void menyapa() {
        System.out.println("Selamat datang, nama lengkapku "+getNamaLengkap()+
                ", umurku "+getUmur()+" tahun.");
    }
}

class MainAbstraksi{
    public static void main(String[] args) {

        //Membuat objek paijo, ratna
        //Yang adalah turunan dari class Manusia
        Paijo paijo = new Paijo("Paijo Kuswoyo",1995);
        Ratna ratna = new Ratna("Ratna Terumpet",1987);

        //Karena kedua class adalah turunan dari class Manusia,
        //Maka keduanya sama-sama memiliki class menyapa()
        //Walaupun methodnya sama, namun class Paijo dan Ratna
        //mengimplementasikan method menyapa dengan cara berbeda.
        paijo.menyapa();
        ratna.menyapa();

    }
}