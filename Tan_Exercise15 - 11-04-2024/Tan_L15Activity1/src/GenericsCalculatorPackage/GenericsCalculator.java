package GenericsCalculatorPackage;

public class GenericsCalculator<T extends Number> {
	private T num_1;
	private T num_2;
	
	public GenericsCalculator(T num_1, T num_2) {
		this.num_1 = num_1;
		this.num_2 = num_2;
	}

	public T getNum_1() {
		return num_1;
	}

	public T getNum_2() {
		return num_2;
	}
	
	public double performOperation(char ops) {
		double result = 0.0;
		switch(ops) {
		case 'a', 'A':
			result = num_1.doubleValue() + num_2.doubleValue();
			System.out.printf("%.2f + %.2f = %.2f\n", num_1.doubleValue(), num_2.doubleValue(), result);
			break;
		case 'b', 'B':
			result = num_1.doubleValue() - num_2.doubleValue();
		System.out.printf("%.2f - %.2f = %.2f\n", num_1.doubleValue(), num_2.doubleValue(), result);
			break;
		case 'c', 'C':
			result = num_1.doubleValue() * num_2.doubleValue();
		System.out.printf("%.2f * %.2f = %.2f\n", num_1.doubleValue(), num_2.doubleValue(), result);
			break;
		case 'd', 'D':
			result = num_1.doubleValue() / num_2.doubleValue();
		System.out.printf("%.2f / %.2f = %.2f\n", num_1.doubleValue(), num_2.doubleValue(), result);
			break;
		case 'e', 'E':
			System.out.println("Thank you for using our calculator");
			System.exit(0);
			break;
		default:
			System.out.println("Kindly choose from the menu");
			break;
				
		}
		return result;
	}
	
}
