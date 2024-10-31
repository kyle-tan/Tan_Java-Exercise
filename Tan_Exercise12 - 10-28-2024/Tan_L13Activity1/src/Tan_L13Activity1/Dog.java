package Tan_L13Activity1;

public class Dog {
	private Size dogSize;
	
	enum Size{
		 SMALL("small"),
		 MEDIUM("medium"),
		 LARGE("large"),
		 XLARGE("extra large"),
		 TINY("tiny");

		private String size;
		Size(String size) {
			// TODO Auto-generated constructor stub
			this.size = size;
		}
		 
	}
	
	public Dog(Size dogSize) {
		this.dogSize = dogSize;
	}
	
	public void selectDogSize() {
		if (!dogSize.size.equalsIgnoreCase("tiny")) {
			System.out.println("I am a "+ dogSize.size +" doggy.");
		} else {
			System.out.println("I don't know which you like.");
		}
	}
}
