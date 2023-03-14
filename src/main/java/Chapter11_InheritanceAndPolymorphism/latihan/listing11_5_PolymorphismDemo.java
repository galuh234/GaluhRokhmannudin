package Chapter11_InheritanceAndPolymorphism.latihan;

public class listing11_5_PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new listing11_2_Circle(1, "red", false));
        displayObject(new listing11_3_Rectangle(1, 1, "black", true));
    }

    private static void displayObject(listing11_2_Circle red) {
    }

    public static void displayObject (listing11_1_GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
