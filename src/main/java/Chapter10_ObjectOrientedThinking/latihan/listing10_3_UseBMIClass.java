package Chapter10_ObjectOrientedThinking.latihan;

public class listing10_3_UseBMIClass {
    private static listing10_4_BMI bmi1;

    public static void main(String[] args) {
        BMI bmi = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Sunan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
