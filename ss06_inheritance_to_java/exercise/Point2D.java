package ss06_inheritance_to_java.exercise;

public class Point2D {
    public float x = 1.0f;
    public float y = 2.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arrPoint2D = {x, y};
        return arrPoint2D;
    }

    @Override
    public String toString() {
        return "Point2D : " +
                "(x,y) = " + "{" + x + " , " + y + "}"
                ;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
    }
}
