package Chapter3_selection.ujian;

import java.util.Scanner;

public class ujiCh3_2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Masukan nama Bulan dalam bahasa indonesia: ");
            String bulan = input.nextLine();
            System.out.println("Masukan Tahun: ");
            int tahun = input.nextInt();

            System.out.print("Pada Bulan " + bulan + " Tahun " + tahun + " ada ");
            switch (bulan) {
                case "Januari":
                case "Maret":
                case "Mei":
                case "Juli":
                case "Agustus":
                case "Oktober":
                case "Desember":
                    System.out.print("31 Hari,");break;
                case "April":
                case "Juni":
                case "September":
                case "November":
                    System.out.print("30 Hari,");break;
                case "Februari":
                    if ((tahun % 4 == 0) && !(tahun % 100 == 0))
                        System.out.print("29 Hari,");
                    else
                        System.out.print("28 Hari,");break;
            }
            if (tahun % 400 == 0)
                System.out.print("\nTahun ini bukan merupakan tahun kabisat");
            else if (tahun % 100 == 0)
                System.out.print("\nTahun ini bukan merupakan tahun kabisat");
            else if (tahun % 4 == 0)
                System.out.print("\nTahun ini merupakan tahun kabisat");
            else
                System.out.print("\nTahun ini bukan merupakan tahun kabisat");
        }
}

