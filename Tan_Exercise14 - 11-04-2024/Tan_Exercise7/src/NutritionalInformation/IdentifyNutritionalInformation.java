package NutritionalInformation;

import FruitsException.FruitNotFoundException;
import java.util.Scanner;

public class IdentifyNutritionalInformation {

	enum Fruits {
		Apple(95, 7.9),
		Banana(105, 9.1),
		Orange(63, 53.2);

		private int calories;
		private double vitaminC;
		
		Fruits(int calories, double vitaminC) {
			// TODO Auto-generated constructor stub
			this.calories = calories;
			this.vitaminC = vitaminC;
		}

		public int getCalories() {
			return calories;
		}

		public double getVitaminC() {
			return vitaminC;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentifyNutritionalInformation obj = new IdentifyNutritionalInformation();
		try {
			obj.verifyFruit(obj.getFruit());
		} catch (FruitNotFoundException fnf) {
			// TODO Auto-generated catch block
			System.err.println("Error: Invalid fruit name entered.");
		}
	}
	
	public String getFruit() {
		String fruitName ="";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a fruit name (Apple, Banana, Orange): ");
		fruitName = input.nextLine();
		return fruitName;
	}
	
	public void verifyFruit(String fruit) throws FruitNotFoundException {
		
		switch(fruit.toLowerCase()) {
		case "apple":
			displayNutritionalInformation(Fruits.Apple);
			break;
		case "banana":
			displayNutritionalInformation(Fruits.Banana);
			break;
		case "orange":
			displayNutritionalInformation(Fruits.Orange);
			break;
		default:
			throw new FruitNotFoundException("Error: Invalid fruit name entered.");
		}
	}
	
	public void displayNutritionalInformation (Fruits fruit) {
		System.out.printf("Nutritional Information for %s"
				+ "\nCalories: %d"
				+ "\nVitamin C: %.2f mg", fruit, fruit.getCalories(), fruit.getVitaminC());
	}

}
