/**
 * The LineSub class, subclass of Point.
 * It inherits the begin point from the superclass, and adds an end point.
 */
public class LineSub extends Point {  // Inherited the begin point
    // Private instance variables
    Point end;   // Declare end as instance of Point

    /** Constructs a LineSub instance with 2 points at (x1, y1) and (x2, y2) */
    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new Point(x2, y2);   // Construct Point instances
    }
    /** Constructs a LineSub instance with the 2 given Point instances */
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());  // Need to construct super
        this.end = end;
    }

    // Getters and Setters
    public Point getBegin() {
        return this;   // upcast to Point (polymorphism - to be discussed later)
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    // Other Get and Set methods
    public int getBeginX() {
        return super.getX();  // inherited, super is optional
    }
    public void setBeginX(int x) {
        super.setX(x);        // inherited, super is optional
    }
    public int getBeginY() {
        return super.getY();
    }
    public void setBeginY(int y) {
        super.setY(y);
    }
    public int[] getBeginXY() {
        return super.getXY();
    }
    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    /** Returns a self-descriptive string */
    public String toString() {
        return "LineSub[begin=" + super.toString() + ",end=" + end + "]";
    }

    /** Returns the length of this line */
    public double getLength() {
        return super.distance(end);
    }
}