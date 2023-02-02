package Chapter6_Method.ujian;

import java.util.Scanner;

public class exam6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan menu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1 :
                System.out.println("\n1. Mengkonversi Biner ke Oktal");
                System.out.println("Masukan Nilai Biner: ");
                long bine = input.nextLong();
                int a = 0, no = 0, nd = 0;
                binkeokt(bine, a, no, nd);break;
            case 2 :
                System.out.println("\n2. Mengkonversi Biner ke desimal");
                System.out.println("Masukan Nilai Biner: ");
                long bin = input.nextLong();
                long j = 1, d = 0;
                binkedes(bin, j, d);break;
            case 3 :
                System.out.println("\n3. Mengkonversi Biner ke Heksa");
                int hed = 0, m2 = 1, c = 1, em = 0, ai = 0;
                System.out.println("Masukan Nilai Biner: ");
                long biner = input.nextLong();
                binkehek(biner, hed, m2, c, em, ai);break;
            case 4 :
                System.out.println("\n4. Mengkonversi Oktal ke Biner");
                System.out.println("Masukan nilai Oktal: ");
                int ok = input.nextInt();
                int e = 0, dv = 0, bv = 0;
                oktkebin(ok, e, dv, bv);break;
            case 5 :
                System.out.println("\n5. Mengkonversi Oktal ke Desimal");
                System.out.println("Masukan nilai Oktal: ");
                int okt = input.nextInt();
                int da = 0, t = 1, dig = 0;
                oktkedes(okt, da, t, dig);break;
            case 6 :
                System.out.println("\n6. Mengkonversi Oktal ke Heksa");
                int desim = 0, i2 = 0, re = 0;
                System.out.println("Masukan nilai Oktal: ");
                int okta = input.nextInt();
                oktkeheks(desim, i2, re, okta);break;
            case 7 :
                System.out.println("\n7. Mengkonversi Desimal ke Biner");
                System.out.print("Masukan Nilai Desimal: ");
                int des = input.nextInt();
                deskebin(des);break;
            case 8 :
                System.out.println("\n8. Mengkonversi bilangan Desimal ke oktal");
                System.out.print("Masukan Nilai desimal: ");
                int des1 = input.nextInt();
                deskeokt(des1);break;
            case 9 :
                System.out.println("\n9. Mengkonversi bilangan Desimal ke heksa");
                System.out.print("Masukan nilai Desimal: ");
                int des2 = input.nextInt();
                deskehex(des2);break;
            case 10 :
                System.out.println("\n10. Mengkonversi Heksa ke Biner");
                System.out.println("Masukan nilai Heksa: ");
                String hek = input.next();
            case 11 :
                System.out.println("\n11. Mengkonversi Heksa ke Oktal");
                int dec = 0, r = 0, u = 0;
                System.out.println("Masukan nilai Heksa: ");
                String heks = input.next();
                hekskeokt(dec, r, u, heks);
            case 12 :
                System.out.println("\n12. Mengkonversi Heksa ke Desimal");
                System.out.println("Masukan nilai Heksa: ");
                String heksa = input.nextLine();
        }
    }
    public static void binkeokt(long bine, int no, int nd, int a) {
        System.out.print("Nilai oktal dari biner " + bine);
        for (a = 1; bine != 0; bine = bine / 10, a = a * 2) {
            nd = (int) (nd + (bine % 10) * a);
        }
        for (a = 1; nd != 0; a = a * 10) {
            no = no + (nd % 8) * a;
            nd = nd / 8;
        }
        System.out.println(" adalah " + no);
    }
    public static void binkedes(long bin, long j, long d) {
        System.out.print("Nilai Desimal dari biner " + bin );
        while (bin != 0) {
            long r = bin % 10;
            d = d + r * j;
            j = j * 2;
            bin = bin / 10;
        }
        System.out.println(" adalah " + d);
    }
    public static void binkehek(long biner, int hed, int m2,
                                int c, int em, int ai) {
        char [] hn = new char[20];
        System.out.print("Nilai Heksa dari Biner " + biner);
        while (biner != 0) {
            em = (int) (biner % 10);
            hed = hed + (em * m2);
            if (c % 4 == 0 ) {
                if (hed < 10)
                    hn[ai] = (char) (hed + 48);
                else
                    hn[ai] = (char) (hed + 55);
                m2 = 1;
                c = 1;
                hed = 0;
                ai++;
            }else {
                m2 = m2 * 2;
                c++;
            }
            biner = biner / 10;
        }
        if(c != 1)
            hn[ai] = (char)(hed + 48);
        if(c == 1)
            ai--;
        System.out.print(" adalah " );
        for(ai = 1; ai >= 0; ai--)
            System.out.print(hn[ai]);
    }
    public static void oktkebin(int ok, int e, int dv, int bv) {
        if (ok >= 8 & ok <= 9)
            System.out.println("Error");
        else
            System.out.print("Nilai Biner dari Oktal " + ok);
        while (ok != 0) {
            dv += (ok % 10) * Math.pow(8, e);
            e++;
            ok /= 10;
        }
        e = 1;
        while (dv != 0) {
            bv += (dv % 2) * e;
            dv /= 2;
            e *= 10;
        }
        System.out.println(" aadalah " + bv);
    }
    public static void oktkedes(int okt, int da, int t, int dig) {
        System.out.print("Nilai Desimal dari Oktal " + okt);
        while (okt != 0) {
            dig = okt % 10;
            da = da + (dig * t);
            t = t * 8;
            okt = okt / 10;
        }
        System.out.println(" adalah " + da);
    }
    public static void deskebin(int des) {
        StringBuilder biner = new StringBuilder();
        for (int i = des; i > 0; i /= 2 ) {
            biner.insert(0, (i % 2));
        }
        System.out.println("Nilai biner dari Desimal " + des +
                " adalah " + biner);
    }
    public static void deskeokt(int des1) {
        String okt = "";
        for (int i = des1; i > 0; i/= 8) {
            okt = (i % 8) + okt;
        }
        System.out.println("Nilai oktal dari desimal " + des1 +
                " adalah " + okt);
    }
    public static void deskehex(int des2) {
        StringBuilder hek = new StringBuilder();
        System.out.print("Nilai heksa dari desimal " + des2);
        while (des2 != 0) {
            int v = des2 % 16;
            char ch = (v >= 0 && v <= 9) ?
                    (char) (v + '0') : (char) (v - 10 + 'A');
            hek.insert(0,ch);
            des2 = des2 / 16;
        }
        System.out.println(" adalah " + hek);
    }
    public static void oktkeheks(int desim, int i2, int re, int okta) {
        char[] hexa = new char[20];
        System.out.print("Nilai Heksa dari Oktal " + okta);
        while (okta != 0) {
            re = okta % 10;
            desim = (int) (desim + (re * Math.pow(8, i2)));
            i2++;
            okta = okta / 10;
        }
        while (desim != 0) {
            re = desim % 16;
            if (re < 10)
                re = re + 48;
            else
                re = re + 55;
            hexa [i2] = (char) re;
            i2++;
            desim = desim / 16;
        }
        System.out.print(" adalah ");
        for(i2 = (i2 - 1); i2 >= 0; i2--)
            System.out.print(hexa[i2]);
    }
    public static void hekskeokt(int dec, int r, int u, String heks) {
        int[] oktal = new int[20];
        int len = heks.length();
        for (len = (len - 1); len >= 0; len--) {
            r = heks.charAt(len);
            if (r >= '0' && r <= '9')
                r = r - 48;
            else if (r >= 'A' && r <= 'F')
                r = r - 55;
            else if (r >= 'a' && r <= 'f')
                r = r - 87;
            else {
                System.out.println("\nnomor ini tidak valid!");
                return;
            }
            int m = 1;
            for (int k = 1; k <= u; k++)
                m *= 16;
            dec = (dec + (r * m));
            u++;
        }
        for (u = 0; dec != 0; dec /= 8)
            oktal[u++] = dec % 8;

        System.out.print("\nNilai Oktal dari heksa " + heks + " adalah ");
        for (u = (u - 1); u >= 0; u--)
            System.out.print(oktal[u]);
    }
}
