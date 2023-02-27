package ss5_access_static_to_java.exercise;

public class TestAM {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.getArea());
        accessModifier = new AccessModifier(2.0);
        System.out.println(accessModifier.getArea());
    }
}
