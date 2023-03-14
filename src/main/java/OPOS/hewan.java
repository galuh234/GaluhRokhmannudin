package OPOS;

public class hewan {
    //atribut
    int tinggi = 8;
    int berat = 5;
    int umur = 5;
};

class behavior {
    public static void main(String[] args) {
        hewan hewanKurakura = new hewan();

        hewanKurakura.tinggi = 8;
        hewanKurakura.berat = 5;
        hewanKurakura.umur = 5;

        System.out.println(hewanKurakura.tinggi + " Cm");
    }
}


