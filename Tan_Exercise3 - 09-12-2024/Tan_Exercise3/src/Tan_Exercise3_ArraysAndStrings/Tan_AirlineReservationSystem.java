package Tan_Exercise3_ArraysAndStrings;

import java.util.Scanner;
import java.util.Arrays;

public class Tan_AirlineReservationSystem {
	final static int capacity = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char[] plane = new char[capacity];
		Arrays.fill(plane, 'o');
		
		do {
		String passengerClass = "";
		int passengerType = getPassengerType();
		int passengerClassNumber = passengerType;
		if (passengerType == 1) {
			passengerClass = "First-Class";
		} else {
			passengerClass = "Economy";
		}
		String response = "";
		int seatNumber = 0;
		boolean available = checkSeatAvailability(passengerClassNumber, plane);
		if (available) {
			seatNumber = assignSeatBasedOnType(passengerClassNumber, plane);
			printBoardingPass(seatNumber+1, plane);
		} else {
			
			if(passengerType == 1) {
				System.out.print("No seat Available. Is it acceptable to be placed in economy section? ");
				
			} else {
				System.out.print("No seat Available. Is it acceptable to be placed in first-class section? ");
			}
			response = input.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				if (passengerType == 1) {
					passengerClassNumber += 1;
					seatNumber = assignSeatBasedOnType(passengerClassNumber, plane);
					printBoardingPass(seatNumber+1, plane);
				} else {
					passengerClassNumber -= 1;
					seatNumber = assignSeatBasedOnType(passengerClassNumber, plane);
					printBoardingPass(seatNumber+1, plane);
				}
			} else {
				System.out.println("Next flight leaves in 3 hours.");
			}
		}
		
		} while (true);
	} 
	
	public static void printBoardingPass(int seatNumber, char[] plane) {
		System.out.println();
		System.out.println("==========================================");
		System.out.println("Your Seat Number is: " + seatNumber);
		System.out.println(Arrays.toString(plane));
		System.out.println("==========================================");
		System.out.println();
	}
	public static int getPassengerType() {
		Scanner input = new Scanner(System.in);
		int passenger = 0;
		do {
			System.out.print("Please Enter Passenger Type: ");
			passenger = input.nextInt();
			if (passenger > 2 || passenger < 1) {
				System.out.println("Invalid type. Only 1 or 2. Please Try again.");
			}
		} while (passenger > 2 || passenger < 1);
		return passenger;
	}
	
	public static int assignSeatBasedOnType(int passengerType, char[] plane) {
		int seatNumber = 0;
		if (passengerType == 1) {
			for (int x = 0; x < plane.length / 2; x++) {
				if (plane[x] == 'o') {
					plane[x] = 'x';
					seatNumber = x;
					break;				
				} else {
					continue;
				}
			}
		} else {
			for (int x = 5; x < plane.length; x++) {
				if (plane[x] == 'o') {
					plane[x] = 'x';
					seatNumber = x;
					break;
				} else {
					continue;
				}
			}
		}
		return seatNumber;
	}
	
	public static boolean checkSeatAvailability(int passengerType, char[] plane) {
		if (passengerType == 1) {
			for (int x = 0; x < plane.length/2; x++) {
				if (plane[x] == 'o') {
					return true;
				}
			}
		} else {
			for (int x = 5; x < plane.length; x++) {
				if (plane[x] == 'o') {
					return true;
				}
			}
		}
		return false;
	}
	
}
