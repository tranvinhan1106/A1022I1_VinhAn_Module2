package ss06_inheritance_to_java.exercise;

public class Cylinder extends Circle {
    private double height = 4.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return 2 * getArea() * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder {" +
                " height = "
                + height
                + ", radius = "
                + getRadius()
                + ", color is :"
                + getColor()
                + '}'
                + "and Perimeter is : "
                + getPerimeter();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
    }
}
