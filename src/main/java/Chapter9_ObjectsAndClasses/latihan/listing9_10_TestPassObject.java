package Chapter9_ObjectsAndClasses.latihan;

public class listing9_10_TestPassObject {
    public static void main(String[] args) {
        Circle myCircle =
                new Circle(1);
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        String n = new String();
        System.out.println("n is " + n);
    }

    public static void printAreas(Circle c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(Double.parseDouble(c.getRadius() + 1));
        }
    }
}
