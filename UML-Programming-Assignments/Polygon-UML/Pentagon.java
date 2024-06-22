import java.lang.Math;

public class Pentagon extends Polygon{
 
  public Pentagon(double aLength){
    super(aLength);
  }

  private double area(){
    return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*getSideLength()*getSideLength();
  }
  
  private double perimeter(){
    return getSideLength()*(double)5;
  }

  public void results(){
    System.out.println("The side length of the pentagon is " + getSideLength() + ".");
    System.out.format("The area for this pentagon is %.2f and the perimeter is %.2f.\n\n", area(), perimeter());
  }
}
