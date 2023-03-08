package ss15_exception_to_java.exercise;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String messenger){
        super(messenger);

    }
}
