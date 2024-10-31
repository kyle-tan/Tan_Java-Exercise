package FriendsAndPhoneNumbers;

import java.util.Scanner;

public class Tan_L14Activity1 {
	int ARRAY_LENGTH = 5;
	String[] name = new String[ARRAY_LENGTH];
	Long[] phoneNumber = new Long[ARRAY_LENGTH];
	
	public static void main (String[] args) {
		
		
		
	}
	
	public String getName() {
		Scanner input = new Scanner(System.in);
		
		return input.nextLine();
	}
	
	public long getPhoneNumber() {
		Scanner input = new Scanner(System.in);
		return input.nextLong();
	}
	
	public void getUserInput() {
		
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			System.out.print("Input name #" +(i+1)+" here: ");
			name[i] = getName();
			if(name[i].equalsIgnoreCase("n/a")) {
				
			}
			phoneNumber[i] = getPhoneNumber();
		}
	}
}
;