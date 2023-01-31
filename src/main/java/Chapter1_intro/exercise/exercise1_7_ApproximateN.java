package Chapter1_intro.exercise;

public class exercise1_7_ApproximateN {
    public static void main(String[] args) {
        double a = 4.0 * ( 1 - ( 1.0 / 3 ) + ( 1.0 / 5 ) - ( 1.0 / 7 ) + ( 1.0 / 9 ) - ( 1.0 / 11 ));
        double b = 4.0 * ( 1 - ( 1.0 / 3 ) + ( 1.0 / 5 ) - ( 1.0 / 7 ) + ( 1.0 / 9 ) - ( 1.0 / 11 ) + ( 1.0 / 13 ));

        System.out.println(" hasil dari 4.0 * ( 1 - ( 1.0 / 3 ) + ( 1.0 / 5 ) - ( 1.0 / 7 ) + ( 1.0 / 9 ) - ( 1.0 / 11 ) : hasilnya adalah " + a );
        System.out.println(" hasil dari 4.0 * ( 1 - ( 1.0 / 3 ) + ( 1.0 / 5 ) - ( 1.0 / 7 ) + ( 1.0 / 9 ) - ( 1.0 / 11 ) + ( 1.0 / 13 ) : hasilnya adalah " + b );
    }
}
