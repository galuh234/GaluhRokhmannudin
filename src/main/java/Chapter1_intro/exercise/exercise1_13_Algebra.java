package Chapter1_intro.exercise;

public class exercise1_13_Algebra {
    public static void main(String[] args) {

        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x +  .55y =  5.9");
        System.out.println("x = (44.5 * .55) - (50.2 * 5.9)");
        System.out.println("    ----------------------------");
        System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
        System.out.println((((44.5 * .55) - (50.2 * 5.9)) /
                ((3.4 * .55) - (50.2 * 2.1))));
        System.out.println(" ");
        System.out.println("y = (3.4 * 5.9) - (44.5 * 2.1)");
        System.out.println("    --------------------------");
        System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
        System.out.println((((3.4 * 5.9) - (44.5 * 2.1)) /
                ((3.4 * .55) - (50.2 * 2.1))));

    }
}
