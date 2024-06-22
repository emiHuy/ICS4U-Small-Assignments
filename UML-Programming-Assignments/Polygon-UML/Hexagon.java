import java.lang.Math;

public class Hexagon extends Polygon{

  public Hexagon(double aLength){
    super(aLength);
  }

  private double area(){
    return 3*Math.sqrt(3)/2*getSideLength()*getSideLength();
  }
  
  private double perimeter(){
    return getSideLength()*(double)6;
  }

  public void results(){
    System.out.println("The side length of the hexagon is " + getSideLength() + ".");
    System.out.format("The area for this hexagon is %.2f and the perimeter is %.2f.\n\n", area(), perimeter());
  }
}
