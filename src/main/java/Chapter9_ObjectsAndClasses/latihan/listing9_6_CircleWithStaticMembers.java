package Chapter9_ObjectsAndClasses.latihan;

public class listing9_6_CircleWithStaticMembers {
    double radius;
    static  int numberOfObjects = 0;
    listing9_6_CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }
    listing9_6_CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}
