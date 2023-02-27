package ss7_abstract_and_interace_to_java.exercise.Resizeable;



public class Square extends Shape{
    private double squareEdge;

    public double getSquareEdge() {
        return squareEdge;
    }

    public Square(double squareEdge) {
        this.squareEdge = squareEdge;
    }

    public Square(String color, boolean filled, double squareEdge) {
        super(color, filled);
        this.squareEdge = squareEdge;
    }

    public Square() {
    }


    public double getArea() {
        return squareEdge * squareEdge;
    }
    public double getAreaChange(){
        int percent = (int) (Math.random()*101);
        resize(percent);
        System.out.println(percent+"%");
        return this.squareEdge*this.squareEdge;
    }

    @Override
    public String toString() {
        return "area of the original Square:" + getArea() + ";" +"\n"+
                "area of square after increasing:" + getAreaChange() +
                '.';
    }

    @Override
    public void resize(double percent) {
        this.squareEdge = this.squareEdge+this.squareEdge*percent/100;
    }
}
