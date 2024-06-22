public class Parallelogram extends Polygon{
  private double height;
  
  public Parallelogram(double aBase, double aHeight){
    // sideLength attribute of the polygon class represents the base of the parallelogram.
    super(aBase);
    height = aHeight;
  }

  public double getHeight(){
    return height;
  }

  public void setHeight(double newHeight){
    height = newHeight;
  }
  
  protected double area(){
    return getSideLength()*height;
  }
  
  protected double perimeter(){
    return 2*getSideLength() + 2*height;
  }

  public void results(){
    System.out.println("The base of the parallelogram is " + getSideLength() + " and the height is " + getHeight() + ".");
    System.out.format("The area for this parallelogram is %.2f and the perimeter is %.2f.\n\n", area(), perimeter());
  }
}