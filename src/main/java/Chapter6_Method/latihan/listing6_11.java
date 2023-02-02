package Chapter6_Method.latihan;

public class listing6_11 {
    public static void main(String[] args) {
        final int NOC = 175;
        final int CPL = 25;

        for (int i = 0; i < NOC; i++) {
            char ch = 0;
            if ((i + 1) % CPL == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
