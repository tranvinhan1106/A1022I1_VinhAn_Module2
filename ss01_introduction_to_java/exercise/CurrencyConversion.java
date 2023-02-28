package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23.000 ;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD:");
        usd = sc.nextDouble();
        double quydoi= usd *23000;
        System.out.print("Giá trị VND :  " +quydoi);
    }
}
