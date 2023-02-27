package ss7_abstract_and_interace_to_java.exercise.Resizeable;
public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes =new Shape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0,2.0);
        shapes[2] = new Square(2.5);
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}

