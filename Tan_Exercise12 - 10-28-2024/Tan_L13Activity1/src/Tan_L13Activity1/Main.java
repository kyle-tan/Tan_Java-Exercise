package Tan_L13Activity1;

import Tan_L13Activity1.Dog.Size;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dog(Size.SMALL).selectDogSize();
		new Dog(Size.MEDIUM).selectDogSize();
		new Dog(Size.LARGE).selectDogSize();
		new Dog(Size.XLARGE).selectDogSize();
		new Dog(Size.TINY).selectDogSize();
	}

}
