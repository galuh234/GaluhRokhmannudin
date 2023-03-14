package ILYAS;

public class hewan1 {
        public hewan1() {
            System.out.println("Hewan Mamalia");
        }
}

class kucing extends hewan1 {
    public kucing() {
        super();
        System.out.println("Kucing bersuara meong");
    }
}

class main {
    public static void main(String[] args) {
        hewan1 hewan = new hewan1();
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof  hewan1));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof kucing));
        System.out.println("---------------------------");

        kucing kucing = new kucing();
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (kucing instanceof hewan1));
        System.out.println("Apakah hewan IS-A Kucing -> " + (kucing instanceof kucing));
    }
}