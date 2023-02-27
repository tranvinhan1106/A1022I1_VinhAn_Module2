package ss5_access_static_to_java.exercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("AN");
        System.out.println(student.getName());
        student.setClasses("A10");
        System.out.println(student.getClasses());
    }
}
