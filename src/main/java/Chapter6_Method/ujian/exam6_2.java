package Chapter6_Method.ujian;

import java.util.Scanner;

public class exam6_2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("BANGUN RUANG");
        int BR = input.nextInt();

        switch (BR) {
            case 1:
                System.out.println("1.Prisma Segitiga");
                System.out.print("alas ");
                double alas = input.nextDouble();
                System.out.print("Tinggi segitiga ");
                double ts = input.nextDouble();
                System.out.print("Tinggi prisma ");
                double tp = input.nextDouble();
                prismasegitiga(alas, ts, tp);break;

            case 2:
                System.out.println("2.Kubus");
                System.out.print("sisi kubus ");
                double sk = input.nextDouble();
                kubus(sk);break;

            case 3:
                System.out.println("3.Balok");
                System.out.print("Tinggi ");
                double t = input.nextDouble();
                System.out.print("Panjang ");
                double p = input.nextDouble();
                System.out.print("Lebar ");
                double l = input.nextDouble();
                Balok(t, p, l);break;

            case 4:
                System.out.println("Tabung");
                final double pi = 3.1415;
                System.out.print("Jari- jari ");
                int j = input.nextInt();
                System.out.print("Diameter ");
                int d = input.nextInt();
                double r = d / 2;
                double d1 = 2 * j;
                System.out.print("Tinggi ");
                double t1 = input.nextDouble();
                tabung(r, t1, pi);break;

            case 5:
                System.out.println("Kerucut");
                final double PI = 3.1415;
                System.out.print("Jari- jari ");
                double jr = input.nextDouble();
                System.out.print("Tinggi ");
                double ti = input.nextDouble();
                System.out.println("Sisi ");
                double s = input.nextDouble();
                kerucut(PI, jr, ti, s);
        }
    }
    public static void prismasegitiga(double alas,
                                      double ts, double tp) {
        double ks = 2 * Math.pow(Math.pow(alas / 2, 2) +
                Math.pow(ts, 2), 0.5) + alas;
        double volume = ((1 * alas * ts) / 2) * tp;
        double luas = (2.0 * 1 / 2.0 * alas * ts) + (ks * tp);
        System.out.println("jadi besar volumnya " + volume +
                " dan luas permukaannya adalah " + String.format("%.2f", luas));
    }
    public static void kubus(double sk) {
        double volume = Math.pow(sk, 3);
        double luas = 6.0 * Math.pow(sk, 2);
        System.out.print("jadi besar volumenya " + volume +
                " dan luas permukaannya " + luas);
    }
    public static void Balok(double t, double p, double l) {
        double volume = p * l * t;
        double luas = 2.0 * ((p * l) + (p * t) + (l * t));
        System.out.println("Jadi besar volume Balok " + volume +
                " dan luas permukaanya " + luas);
    }
    public static void tabung(double r, double t1, double pi) {
        double volume = pi * Math.pow(r, 2) * t1;
        double luas = 2.0 * pi * r * (r + t1);
        System.out.println("Jadi besar volume tabung " + volume +
                " dan luas permukaannya " + luas);
    }
    public static void kerucut(double PI, double ti, double jr, double s) {
        double volume = 1 / 3.0 * PI * Math.pow(jr, 2) * ti;
        double luas = (PI * Math.pow(jr, 2)) + (PI * jr * s);
        System.out.println("Jadi besar volume Kerucut " + volume +
                " dan luas permukaannya " + luas);
    }
}
