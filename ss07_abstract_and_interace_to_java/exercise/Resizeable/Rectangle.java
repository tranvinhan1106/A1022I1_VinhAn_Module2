package ss07_abstract_and_interace_to_java.exercise.Resizeable;

public class Rectangle extends Shape {
    private double width = 1.0 ;
    private double length = 1.0 ;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*this.length;
    }

    public double getAreaChange(){
        int percent = (int) (Math.random()*101);
        resize(percent);
        System.out.println(percent+"%");
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return   "area of the original rectangle:" + getArea() + ";" + "\n" +
                "area of rectangle after increasing:" + getAreaChange() +
                '.';
    }

    @Override
    public void resize(double percent) {
        this.length=this.length+this.length*percent/100;
        this.width=this.width+this.width*percent/100;
    }
}
