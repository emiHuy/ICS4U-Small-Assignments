import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// Your driver code here: create the Circle object and call your object method(s)
		Scanner input = new Scanner(System.in);		
		
		// Instantiating circle object with default constructor and set method
		Circle circle1 = new Circle();
		System.out.print("What is the radius? ");
		circle1.setRadius(input.nextDouble());
		circle1.results();

		System.out.print("What is the radius? ");
		double radiusInput = input.nextDouble();
		// Instantiating circle object with constructer method based on radius value given
		Circle circle2 = new Circle(radiusInput);
		circle2.results();
	}
}