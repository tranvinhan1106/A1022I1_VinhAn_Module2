package ss11_stack_queue_to_java.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        Map<String, Integer> myMap = new TreeMap<>();
        String[] arr = str.split(" ");
        int count;
        String word;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            word = arr[i];
            if (myMap.containsKey(word)) {
                myMap.put(word, count + 1);
            } else {
                myMap.put(word, count);
            }
        }
        for (String key : myMap.keySet()) {
            System.out.println(key + ":" + myMap.get(key) + " times");
        }
    }
}

