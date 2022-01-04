public class Point3D extends Point2D{
    private int z;

    public Point3D(){
        super();
        this.z=0;
    }

    public Point3D(int x, int y,int z){
        super(x,y);
        this.z=z;
    }
    public int getZ() {
        return this.z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    /** Returns a self-descriptive string in the form of "(x,y,z)" */
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }

}