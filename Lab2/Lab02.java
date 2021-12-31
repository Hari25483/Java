public class Lab02 {
  public static void main(String args[]) {
    // Complete Task C

    double radius = 0;
    String unit = "";
    int i = 0;
    while (i < args.length) {
      radius = Float.parseFloat(args[0]);
      unit = args[1];
      i++;
    }
    Circle c1 = new Circle(radius);
    Square s1 = new Square(radius);
    Sphere sp1 = new Sphere(radius);
    Cube cb1 = new Cube(radius);
    if ((args[1].equals("mm")==true) || (args[1].equals("cm")==true) || (args[1].equals("m")==true)) {
      System.out.printf("Area of a circle with %.0f %s radius: %d %s² \n", radius, unit, Math.round(c1.getArea()),unit);
      System.out.printf("Surface area of a sphere with %.0f %s radius: %d %s² \n", radius, unit, Math.round(sp1.getSurfaceAreaArea()),unit);
      System.out.printf("Area of a square with %.0f %s² side: %d %s \n", radius, unit, Math.round(s1.getArea()),unit);
      System.out.printf(" Surface area of a cube with %.0f %s side: %d %s² \n", radius, unit, Math.round(cb1.getSurfaceArea()),unit);
      System.out.printf("Volume of a sphere with %.0f %s radius: %d %s ³\n", radius, unit, Math.round(sp1.getVolume()),unit);
      System.out.printf("Volume of a cube with %.0f %s side: %d %s³\n", radius, unit, Math.round(cb1.getVolume()),unit);
    }
    else{
      System.out.println("Invalid unit input");
      System.out.printf("Area of a circle with %.0f radius: %d\n", radius, Math.round(c1.getArea()));
      System.out.printf("Surface area of a sphere with %.0f radius: %d\n", radius, Math.round(sp1.getSurfaceAreaArea()));
      System.out.printf("Area of a square with %.0f side: %d\n", radius,Math.round(s1.getArea()));
      System.out.printf(" Surface area of a cube with %.0f side: %d\n", radius, Math.round(cb1.getSurfaceArea()));
      System.out.printf("Volume of a sphere with %.0f radius: %d\n", radius, Math.round(sp1.getVolume()));
      System.out.printf("Volume of a cube with %.0f side: %d\n", radius, Math.round(cb1.getVolume()));
    }
  }
}
class Circle {
  private double area;
  private double radius;

  // Implement A
  public Circle(double radius){
    this.radius=radius;
  }
  public double getArea() {
    return radius * radius * Math.PI;
  }
}

class Square {
  private double area;
  private double length;
  // Implement A
  public Square(double length){
    this.length=length;
  }
  public double getArea() {
    return length*length;
  }
}

class Sphere {
  private double surfaceArea;
  private double volume;
  private double radius;
  // Implement A
  public Sphere(double radius){
    this.radius=radius;
  }
  public double getSurfaceAreaArea() {
    return radius*radius*4*Math.PI;
  }

  public double getVolume() {
    return radius*radius*radius*4/3*Math.PI;
  }
  // Implement B
}

class Cube {
  private double surfaceArea;
  private double volume;
  private double length;


  // Implement A

  public Cube(double length){
    this.length=length;
  }
  public double getSurfaceArea() {
    return length*length*6;
  }
  public double getVolume() {
    return length*length*length;
  }
  // Implement B
}