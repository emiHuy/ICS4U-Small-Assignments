public class Rectangle extends Parallelogram {
  public Rectangle(double aBase, double aHeight){
    super(aBase, aHeight);
  }

  public void results(){
    System.out.println("The length of the rectangle is " + getSideLength() + " and the width is " + getHeight() + ".");
    System.out.format("The area for this rectangle is %.2f and the perimeter is %.2f.\n\n", area(), perimeter());
  }
}