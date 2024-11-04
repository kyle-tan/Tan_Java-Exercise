package FriendsAndPhoneNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.OutOfBoundDigitsException;

public class Tan_L14Activity1 {
	int ARRAY_LENGTH = 5;
	String[] name = new String[ARRAY_LENGTH];
	Long[] phoneNumber = new Long[ARRAY_LENGTH];
	
	public static void main (String[] args){
		
		Tan_L14Activity1 obj = new Tan_L14Activity1();
		
		obj.getUserInput();
		String searchName = "";
		do {
		obj.displayContacts();
		searchName = obj.nameToSearch();
		obj.searchForName(searchName);
		} while (!searchName.equalsIgnoreCase("exit"));
		
	}
	
	public String getName() {
		Scanner input = new Scanner(System.in);
		
		return input.nextLine().trim();
	}
	
	public long getPhoneNumber() {
		Scanner input = new Scanner(System.in);
		return input.nextLong();
	}
	
	public void getUserInput() {
		String userName = "";
		long userNumber = 0;
		
		for(int i = 0; i < ARRAY_LENGTH;) {
			boolean valid = true;
			try {
				System.out.print("Input name #" +(i+1)+" here: ");
				userName = getName();
				if(userName.equalsIgnoreCase("n/a")) {
					break;
				}
				System.out.print("Input number of name #" +(i+1)+" here: ");
				userNumber = getPhoneNumber();
				OutOfBoundDigitsException.validateDigits(userNumber);
			} catch (InputMismatchException ime) {
				System.err.println("Invalid input! Only whole numbers are allowed.");
				valid = false;
			} catch (OutOfBoundDigitsException obde) {
				System.err.println("Invalid phone number! Only 10-digit number is allowed");
				valid = false;
				
			} finally {
				if (valid) {
					name[i] = userName;
					phoneNumber[i] = userNumber;
					i++;
				}
			}
		}
	}
	
	public void displayContacts() {
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			if(name[i].equalsIgnoreCase("n/a")) {
				break;
			}
			System.out.printf("\n[%d] %s",(i+1), name[i]);
		}
	}
	
	public String nameToSearch() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("\nSearch a name: ");
		return input.nextLine().trim();
	}
	
	public void searchForName(String nameToFind) {
		boolean exist = false;
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			if (name[i].equalsIgnoreCase(nameToFind)) {
				System.out.printf("\nName: %s\nPhone number: %d", name[i], phoneNumber[i]);
				exist = true;
				break;
			}
		}
		if(!exist) {
			System.out.println("Name does not exist in contacts");
		}
	}
}
;