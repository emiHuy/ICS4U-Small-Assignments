import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Pentagon
    System.out.println("---PENTAGON---");
    System.out.print("Side length: ");
    double sideLength = in.nextDouble();
    Pentagon pentagon = new Pentagon(sideLength);
    pentagon.results();

    System.out.print("New side length: ");
    sideLength = in.nextDouble();
    pentagon.setSideLength(sideLength);
    pentagon.results();

    // Hexagon
    System.out.println("---HEXAGON---");
    System.out.print("Side length: ");
    sideLength = in.nextDouble();
    Hexagon hexagon = new Hexagon(sideLength);
    hexagon.results();

    System.out.print("New side length: ");
    sideLength = in.nextDouble();
    hexagon.setSideLength(sideLength);
    hexagon.results();
    
    // Parallelogram
    System.out.println("---PARALLELOGRAM---");
    System.out.print("Base: ");
    sideLength = in.nextDouble();
    System.out.print("Height: ");
    double height = in.nextDouble();
    Parallelogram parallelogram = new Parallelogram(sideLength, height);
    parallelogram.results();

    System.out.print("New base: ");
    sideLength = in.nextDouble();
    parallelogram.setSideLength(sideLength);
    System.out.print("New height: ");
    height = in.nextDouble();
    parallelogram.setHeight(height);
    parallelogram.results();
    
    // Rectangle
    System.out.println("---RECTANGLE---");
    System.out.print("Base: ");
    sideLength = in.nextDouble();
    System.out.print("Height: ");
    height = in.nextDouble();
    Rectangle rectangle = new Rectangle(sideLength, height);
    rectangle.results();

    System.out.print("New base: ");
    sideLength = in.nextDouble();
    rectangle.setSideLength(sideLength);
    System.out.print("New height: ");
    height = in.nextDouble();
    rectangle.setHeight(height);
    rectangle.results();
   
    // Square
    System.out.println("---SQUARE---");
    System.out.print("Side length: ");
    sideLength = in.nextDouble();
    Square square = new Square(sideLength);
    square.results();

    System.out.print("New side length: ");
    sideLength = in.nextDouble();
    square.setSideLength(sideLength);
    square.results();
  }
}