package ss2_loop_to_java.exercise;

import java.util.Scanner;

public class MergeArray {
    static int myArrFirst[] ;
    static int myArrSecond[];
    static int myArrNew[];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myArrFirst = new int[3];
        myArrSecond = new int[3];
        for (int i = 0; i < myArrFirst.length; i++) {
            System.out.print("Enter value the element " + i + " Of myArrFirst:");
            myArrFirst[i]= scanner.nextInt();
        }
        System.out.println("Now Enter value element ArrSecond!");
        for (int i = 0; i < myArrSecond.length; i++) {
            System.out.print("Enter value the element " + i + " Of myArrSecond:");
            myArrSecond[i] = scanner.nextInt();
        }
        int first = myArrFirst.length;
        int second = myArrSecond.length;
        myArrNew = new int[first+second];
        System.arraycopy(myArrFirst,0,myArrNew,0,first);
        System.arraycopy(myArrSecond,0,myArrNew,first,second);
        for (int value : myArrNew){
            System.out.print(value + "\t");
        }
    }
}
