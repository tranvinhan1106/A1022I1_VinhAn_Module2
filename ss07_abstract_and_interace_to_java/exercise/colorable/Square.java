package ss07_abstract_and_interace_to_java.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double squareEdge;


    public Square() {
    }

    public Square(double squareEdge) {
        this.squareEdge = squareEdge;
    }

    public double getSquareEdge() {
        return squareEdge;
    }

    public void setSquareEdge(double squareEdge) {
        this.squareEdge = squareEdge;
    }

    public double getArea() {
        return getSquareEdge() * getSquareEdge();
    }

    @Override
    public String toString() {
        return "Square{" +
                "Area of Square=" + getArea() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
