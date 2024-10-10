package Tan_Exercise4;

public class IsoscelesTriangle extends Triangle{

	public IsoscelesTriangle(double s, double b) {
		super(s, b);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateArea() {
		//return (Math.sqrt((Math.pow(getSides(),2) - Math.pow(getBase(), 2))/4) * getBase()) / 2;
		
		return ((Math.sqrt((Math.pow(getSides(),2)) - Math.pow(getBase(),2)/4)) * getBase())/2;
	}

	public double calculatePerimeter() {
		return getBase() + (2 * getSides());
	}
	
	public String toString() {
		return "Isosceles Triangle: " + "\nSide is " + getSides() +
				"\nBase is " + getBase() + 
				"\nArea is " + calculateArea() +
				"\nPerimeter is " +calculatePerimeter();
	}
}

