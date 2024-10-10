package Tan_Exercise4;

public class RightTriangle extends Triangle{
	private double height;
	
	public RightTriangle(double s, double b, double height) {
		super(s, b);
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	
	public double calculateArea() {
		return (getBase() * height) / 2;
	}
	
	public double calculatePerimeter() {
		return getSides() + getBase() + height;
	}
	public String toString() {
		return "Right Triangle: " + "\nSide is " + getSides() +
				"\nBase is " + getBase() + 
				"\nHeight is " + height +
				"\nArea is " + calculateArea() +
				"\nPerimeter is " +calculatePerimeter();
	}
}
