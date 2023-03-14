package Chapter11_InheritanceAndPolymorphism.latihan;

public class listing11_3_Rectangle extends listing11_1_GeometricObject {
    private double width;
    private double height;
    public listing11_3_Rectangle() {
    }
    public listing11_3_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public listing11_3_Rectangle(double width, double height, String color, boolean filled) {
        this. width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
