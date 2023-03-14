package Chapter11_InheritanceAndPolymorphism.exercise;

import java.util.Scanner;

public class exercise11_10 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a MyStack
        MyStack stack = new MyStack();

        // Prompt the user to enter five strings
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        // Display in reverse order
        System.out.println("Stack: " + stack.toString());
    }
}
