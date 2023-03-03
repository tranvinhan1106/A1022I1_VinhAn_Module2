package ss13_searchalgorithm_to_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] myArray;

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(myArray, middle + 1, myArray.length, value);
            } else {
                return binarySearch(myArray, 0, middle - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size :");
        int size = scanner.nextInt();
        myArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ":");
            myArray[i] = scanner.nextInt();
        }
        Arrays.sort(myArray);
        System.out.print("your array after sorting is :");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.println();
        System.out.println("enter the value you want to search : ");
        int value = scanner.nextInt();
        System.out.println("value is in position :");
        System.out.println(binarySearch(myArray, 0, myArray.length - 1, value));
    }
}
