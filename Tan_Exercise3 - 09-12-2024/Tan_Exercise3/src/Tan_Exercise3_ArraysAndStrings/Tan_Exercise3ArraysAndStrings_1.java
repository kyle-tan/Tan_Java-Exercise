package Tan_Exercise3_ArraysAndStrings;

import java.util.Arrays;

public class Tan_Exercise3ArraysAndStrings_1 {
	final static int ARRAY_SIZE = 10; // Declare a constant ARRAY_SIZE that’s initialized to 10
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] fractions = new double[ARRAY_SIZE];//Declare an array with ARRAY_SIZE elements of type double,
		
		Arrays.fill(fractions, 0);// and initialize the elements to 0
		
		//Refer to array index 4
		System.out.println(fractions[4]);
		
		//Assign the value of 1.667 to array index 9
		fractions[9] = 1.667;
		
		//Assign the value of 3.333 to array index 6
		fractions[6] = 3.333;
		
		/*
		 * Sum all the elements of the array, using a for statement. Declare the 
		 * integer variable x as a control variable for the loop.
		 */
		double sum = 0;
				
		for(int x=0; x<ARRAY_SIZE;x++) {
			sum += fractions[x];
		}
		
		System.out.println(sum);
	}

}
