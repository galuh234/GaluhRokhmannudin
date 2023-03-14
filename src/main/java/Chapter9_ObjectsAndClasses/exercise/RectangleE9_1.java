package Chapter9_ObjectsAndClasses.exercise;

public class RectangleE9_1 {
   double width;
   double height;

   RectangleE9_1() {
       width = 1;
       height = 1;
   }

   RectangleE9_1(double newWidth, double newHeight) {
       width = newWidth;
       height = newHeight;
   }

   double getArea() {
       return  width * height;
   }

   double getPerimeter() {
       return 2 * (width + height);
   }
}
