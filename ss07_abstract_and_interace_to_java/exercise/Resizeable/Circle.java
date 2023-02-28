package ss07_abstract_and_interace_to_java.exercise.Resizeable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getAreaChange(){
        int percent = (int) (Math.random()*101);
        resize(percent);
        System.out.println(percent +"%");
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "area of the original circle:" + getArea() + ";" +"\n"+
                "area of circle after increasing:" + getAreaChange() +
                '.';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * percent/100 ;
    }

}
