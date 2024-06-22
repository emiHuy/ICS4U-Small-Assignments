class Circle {
	// Attributes
	private double radius;
	private static final double PI = 3.14159;
	
	// Constructor
	public Circle(){
		radius = 0.0;
	}
	
	public Circle(double radiusInput){
		radius = radiusInput;
	}
	
	// Getters and  Setters
	public double getRadius(){
		return radius;
	}

	public void setRadius(double newRadius){
		radius = newRadius;
	}
	
	// class methods
	private double diameter(){
		return radius*2;
	}

	private double circumference(){
		return PI*radius*2;
	}

	private double area(){
		return PI*radius*radius;
	}

	public void results(){
		System.out.println("The radius of the circle is " + getRadius() + ", so the diameter is " + diameter() + ".");
		System.out.format("The area for this circle is %.2f and the circumference is %.2f.\n\n", area(), circumference());
	}
}