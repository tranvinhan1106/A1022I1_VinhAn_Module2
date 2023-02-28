package ss06_inheritance_to_java.exercise;

public class Point3D extends Point2D {
    public float z = 3.0f ;

    public Point3D() {
    }
    public Point3D(float z) {
        this.z = z ;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float []getXYZ (){
        float []arrPoint3D = {x,y,z};
        return arrPoint3D ;
    }

    @Override
    public String toString() {
        return "Point3D = " + "(x,y,z) ="
                +"{" +x +","
                +y +","
                +z+"}";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
    }
}
