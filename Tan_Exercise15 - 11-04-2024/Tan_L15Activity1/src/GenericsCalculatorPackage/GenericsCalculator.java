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
	
	
}
