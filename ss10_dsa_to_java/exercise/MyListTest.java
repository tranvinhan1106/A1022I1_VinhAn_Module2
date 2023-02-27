package ss10_dsa_to_java.exercise;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(0, 5);
        myList.add(1, 20);
        myList.remove(2);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
