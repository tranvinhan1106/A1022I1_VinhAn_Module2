package ss03_method_to_java.exercise;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng :");
        int size = scanner.nextInt();
        int myArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập giá trị tại vị trí thứ : " +i);
            myArr[i]=scanner.nextInt();
        }
        int min = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (min > myArr[i]){
                min = myArr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là :" + min);
    }
}
