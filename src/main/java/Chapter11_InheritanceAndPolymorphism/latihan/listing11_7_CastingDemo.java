package Chapter11_InheritanceAndPolymorphism.latihan;

public class listing11_7_CastingDemo {
    public static void main(String[] args) {
        Object object1 = new listing11_2_Circle(1);
        Object object2 = new listing11_3_Rectangle(1, 1);

        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object){
        if (object instanceof listing11_2_Circle) {
            System.out.println("The circle area is " + ((listing11_2_Circle)object).getArea());
            System.out.println("The circle area is " + ((listing11_2_Circle)object).getDiameter());
        }
        else if (object instanceof listing11_3_Rectangle) {
            System.out.println("The rectangle area is " + ((listing11_3_Rectangle)object).getArea());
        }
    }
}
