package Chapter1_intro.exercise;

public class exercise1_12_AverageSpeedInKilometers {
    public static void main(String[] args) {

        System.out.println("Miles / hour / + (minutes / 60) + (second / 3600)) * 1.6");
        System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");
        System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
    }
}
