package Chapter10_ObjectOrientedThinking.exercise;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;


    MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        return null;
    }

    // Methods
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.x = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        return getDistance(this.y, y) <= height / 2 &&
                getDistance(this.x, x) <= width / 2;
    }


    public boolean contains(MyRectangle2D r) {
        return
                getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                        getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                        height / 2 + r.getHeight() / 2 <= height &&
                        width / 2 + r.getWidth() / 2 <= width;
    }

    public boolean overlaps(MyRectangle2D r) {
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }

    private double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}
