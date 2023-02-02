package Chapter6_Method.latihan;

import java.util.Scanner;

public class listing6_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();
        System.out.println("The decimal value for hex number " +
                hex + " is " + htd(hex.toUpperCase()));
    }
    public static int htd(String hex) {
        int dv = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hc = hex.charAt(i);
            dv = dv *16 + hexchartodecimal(hc);
        }
        return dv;
    }
    public static int hexchartodecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
