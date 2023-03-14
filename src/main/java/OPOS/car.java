package OPOS;

public class car {
    String merk;
    int prince;
    String color;
};
class indentitas12{
    public static void main(String[] args) {
        car carRush = new car();
        car carAlpart = new car();

        carRush.merk = "RUSH";
        carRush.prince = 80;
        carRush.color = "Yellow";

        carAlpart.merk = "ALPART";
        carAlpart.prince = 200;
        carAlpart.color = "red";

        System.out.println(carRush.merk);
        System.out.println(carRush.prince + " Juta");
        System.out.println(carRush.color + "\n");
        System.out.println(carAlpart.merk);
        System.out.println(carAlpart.prince + " Juta");
        System.out.println(carAlpart.color);
    }
}

