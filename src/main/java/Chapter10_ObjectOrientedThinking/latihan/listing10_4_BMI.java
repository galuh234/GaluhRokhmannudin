package Chapter10_ObjectOrientedThinking.latihan;

public class listing10_4_BMI {
    private static final double METER_PER_INCH = 0.45359237;
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public listing10_4_BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public listing10_4_BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METER_PER_INCH) * (height * METER_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
   public String getName() {
        return name;
   }
   public int getAge() {
        return age;
   }
   public double getWeight()
   {
       return weight;
   }
   public double getHeight() {
        return height;
   }

    public String getStatus() {
        return null;
    }
}
