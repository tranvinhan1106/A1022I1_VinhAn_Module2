package ss2_loop_to_java.exercise;

public class DisplayPrimes {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        for (int i = 0; ; i++) {
            int testNum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    testNum++;
                }
            }
            if (testNum == 2) {
                count++;
                System.out.println(i);
            }
            if (count == number) {
                break;
            }
        }
    }
}
