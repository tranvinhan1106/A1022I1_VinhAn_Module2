package ss11_stack_queue_to_java.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ReserveStack {
    static int arrInt[];
    static String arrStr[];

    public static void main(String[] args) {
        //        ***đảo ngược mảng số nguyên***
//        Stack<String> stack = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n = scanner.nextInt();
//        arrInt = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter element " + i + ":");
//            arrInt[i] = scanner.nextInt();
//            stack.push(String.valueOf(arrInt[i]));
//        }
//        int i = 0;
//        while (!(stack.empty())) {
//            arrInt[i] = Integer.parseInt(stack.pop());
//            i++;
//        }
//        System.out.print("arrInt:");
//        for (int j = 0; j < n; j++) {
//            System.out.print(arrInt[j] + "\t");
//        }

//        ***đảo ngược chuỗi***
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String mWorld =scanner.nextLine();
        char temp;
        for (int i = 0; i <mWorld.length() ; i++) {
            temp=mWorld.charAt(i);
            wStack.push(String.valueOf(temp));
        }
        mWorld="";
        while (!(wStack.empty())){
            mWorld+=wStack.pop();
        }
        System.out.println(mWorld);
    }
}
