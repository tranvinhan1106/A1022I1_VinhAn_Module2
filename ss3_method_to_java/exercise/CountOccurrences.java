package ss3_method_to_java.exercise;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = "tranvinhan";
        System.out.println("Nhập vào 1 ký tự cần tìm kiếm:");
        char characters = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (characters == inputString.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
