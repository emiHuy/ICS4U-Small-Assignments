public class Square extends Rectangle{
  
  public Square(double aSide){
    super(aSide, aSide);
  }

  public void setSideLength(double newSideLength){
    super.setSideLength(newSideLength);
    super.setHeight(newSideLength);
  }

  public void results(){
    System.out.println("The side length of the square is " + getSideLength() + ".");
    System.out.format("The area for this square is %.2f and the perimeter is %.2f.\n\n", area(), perimeter());
  }
}