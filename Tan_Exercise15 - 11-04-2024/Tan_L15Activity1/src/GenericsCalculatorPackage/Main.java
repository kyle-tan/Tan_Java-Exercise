package GenericsCalculatorPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char operation = 'x';
		GenericsCalculator<Double> obj = new GenericsCalculator<Double>(10.8, 11.2);
		
		System.out.printf("\n1st Number: %.5f: "
				+ "\n2nd Number: %.5f", obj.getNum_1(), obj.getNum_2());
		System.out.printf("[A] Addition"
				+ "\n[B] Subtraction"
				+ "\n[C] Multiplication"
				+ "\n[D] Division"
				+ "\n[E] Exit Program");
		
		System.out.print("Operation: ");
		operation = input.next().charAt(0);
	}
	
	public <T> performOperation(char ops) {
		switch(ops.toLowerCase()) {
			
		}
	}
}
