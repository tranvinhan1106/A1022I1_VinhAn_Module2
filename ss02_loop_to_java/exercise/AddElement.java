package ss02_loop_to_java.exercise;

import java.util.Scanner;

public class AddElement {
    static int myArr[];
    static int myArrAdd[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length array :");
        int Value = scanner.nextInt();
        myArr = new int[Value];
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("enter value element " + i + ":");
            myArr[i] = scanner.nextInt();
        }
        System.out.println("Array is :");
        for (int value : myArr) {
            System.out.print(value + "\t");
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("\n Enter the number to add : ");
        int X = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("extra location : ");
        int index = scanner2.nextInt();
        if (index <= 1 || index >= myArr.length - 1) {
            System.out.print("Unable to insert element into array !");
        } else {
            myArrAdd = new int[myArr.length + 1];
            for (int i = 0; i < myArrAdd.length; i++) {
                if (i == index) {
                    myArrAdd[i] = X;
                    myArrAdd[i+1]=myArr[index];
                } else if (i < myArrAdd.length - 2) {
                    myArrAdd[i] = myArr[i];
                }
            }
            for (int value : myArrAdd) {
                System.out.print(value + "\t");
            }
        }
    }
}
