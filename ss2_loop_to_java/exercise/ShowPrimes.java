package ss2_loop_to_java.exercise;

public class ShowPrimes {
    public static void main(String[] args) {
        int number = 100;
        int count;
        for (int i = 2; i <= number ; i++) {
            count = 0;
            for (int j = 1; j <=i ; j++) {
                if (i % j ==0){
                    count++;
                }
            }if (count ==2 ){
                System.out.println(i);
            }
        }
    }
}
