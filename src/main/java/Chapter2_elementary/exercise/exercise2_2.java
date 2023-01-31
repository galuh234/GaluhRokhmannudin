package Chapter2_elementary.exercise;

import java.util.Scanner;

public class exercise2_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double PI = 3.14159265359;

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The are is " + area);
        System.out.println("The volume is " + volume);
    }
}
