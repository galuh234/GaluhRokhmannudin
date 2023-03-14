package Chapter9_ObjectsAndClasses.exercise;

public class exercise9_1 {
    public static void main(String[] args) {
        RectangleE9_1 rectangle1 = new RectangleE9_1(4, 40);
        RectangleE9_1 rectangle2 = new RectangleE9_1(3.5, 35.9);

        System.out.println("\n Rectangle 1");
        System.out.println("-------------");
        System.out.println("Width:      " + rectangle1.width);
        System.out.println("Heigth:     " + rectangle1.height);
        System.out.println("Area:       " + rectangle1.getArea());
        System.out.println("Perimeter   " + rectangle1.getPerimeter());

        System.out.println("\n Rectangle 2");
        System.out.println("-------------");
        System.out.println("Width:      " + rectangle2.width);
        System.out.println("Heigth:     " + rectangle2.height);
        System.out.println("Area:       " + rectangle2.getArea());
        System.out.println("Perimeter   " + rectangle2.getPerimeter());
    }
}
