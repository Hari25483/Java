public class TestPoint2DPoint3D {
    public static void main (String[] args){
        Point2D p2a=new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b=new Point2D();
        System.out.println(p2b);
        p2a.setX(3);
        p2a.setY(4);
//        Point2D p2a=new Point2D(1,2);
        System.out.println(p2a);

        Point3D p3a=new Point3D(11,5,5);
        System.out.println(p3a);
        p3a.setX(21);  // in superclass
        p3a.setY(22);  // in superclass
        p3a.setZ(23);  // in this class
        System.out.println(p3a);  // toString()
        System.out.println("x is: " + p3a.getX());  // in superclass
        System.out.println("y is: " + p3a.getY());  // in superclass
        System.out.println("z is: " + p3a.getZ());  // in this class
    }
}