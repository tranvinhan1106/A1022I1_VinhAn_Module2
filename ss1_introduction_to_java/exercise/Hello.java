package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tên vào đây :");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
