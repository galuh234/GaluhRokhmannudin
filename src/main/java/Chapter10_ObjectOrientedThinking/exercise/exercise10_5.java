package Chapter10_ObjectOrientedThinking.exercise;

import Chapter10_ObjectOrientedThinking.latihan.StackOfIntegers;

import java.util.Scanner;

public class exercise10_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        System.out.print("The smallest factors of " + number + " are: ");
        StackOfIntegers stack = new StackOfIntegers();

        smallestFactors(number, stack);

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void smallestFactors(int number, StackOfIntegers stack) {
        int i = 2;
        while (number / i != 1){
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            }
            else
                i++;
        }
        stack.push(number);
    }
}
