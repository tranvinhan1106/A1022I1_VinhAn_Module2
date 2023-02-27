package ss2_loop_to_java.exercise;

import java.util.Scanner;

public class DeleteElement {
    static int myArr[] ;
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length array :");
        int N = scanner.nextInt();
        myArr = new int[N];
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("enter value element " + i + ":");
            myArr[i]= scanner.nextInt();
        }
        System.out.println("Array is :");
        for (int value : myArr) {
            System.out.print(value + "\t");
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\n Enter the element to be deleted :");
        int M = scanner1.nextInt();
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == M){
                System.out.println("The element's position is :" + i);
                myArr[i]= myArr[i+1];
            }
            else if (i == myArr.length-1){
                myArr[i]=0;
            }
        }
        System.out.println("The new array is :");
        for (int value : myArr){
            System.out.println(value + "\t");
        }
    }
}
