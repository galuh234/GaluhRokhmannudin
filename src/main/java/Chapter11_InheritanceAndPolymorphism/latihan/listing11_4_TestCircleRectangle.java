package Chapter11_InheritanceAndPolymorphism.latihan;

public class listing11_4_TestCircleRectangle {
    public static void main(String[] args) {
        listing11_2_Circle circle = new listing11_2_Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        listing11_3_Rectangle rectangle = new listing11_3_Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
