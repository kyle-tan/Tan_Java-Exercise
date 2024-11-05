package GenericsCalculatorPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char operation = 'x';
		GenericsCalculator<Double> obj = new GenericsCalculator<Double>(10.8, 11.2);
		do {
			System.out.printf("\n1st Number: %f "
					+ "\n2nd Number: %f", obj.getNum_1(), obj.getNum_2());
			System.out.printf("\n[A] Addition"
					+ "\n[B] Subtraction"
					+ "\n[C] Multiplication"
					+ "\n[D] Division"
					+ "\n[E] Exit Program\n");
		
			System.out.print("Operation: ");
			operation = input.next().charAt(0);
			obj.performOperation(operation);
		} while (true);
	}
	
	
}
