package ss11_stack_queue_to_java.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Decimal :");
        int number = sc.nextInt();
        while (number > 0) {
            myStack.push(number % 2);
            number /= 2;
        }
        while (!(myStack.empty())) {
            System.out.print(myStack.pop());
        }
    }
}

