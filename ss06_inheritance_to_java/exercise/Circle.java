package ss06_inheritance_to_java.exercise;


public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(3.0, "Black");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                '}'
                + "  and area is :"
                + this.getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

    }
}
