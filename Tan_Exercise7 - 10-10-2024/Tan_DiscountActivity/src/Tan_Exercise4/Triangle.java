package Tan_Exercise4;

public class Triangle {
	private double sides;
	private double base;
	
	public Triangle(double s, double b) {
		sides = s;
		base = b;
	}
	
	public double getSides() {
		return sides;
	}
	public double getBase() {
		return base;
	}
	
	public double calculateArea() {
		return (base * sides) / 2;
	}
	
	public double calculatePerimeter() {
		return (base + sides + sides);
	}

}
