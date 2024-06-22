public class Polygon{

  // General side length of a polygon.
  private double sideLength;

  public Polygon(double aLength){
    sideLength = aLength;
  }

  public double getSideLength(){
    return sideLength;
  }

  public void setSideLength(double newLength){
    sideLength = newLength;
  }
}