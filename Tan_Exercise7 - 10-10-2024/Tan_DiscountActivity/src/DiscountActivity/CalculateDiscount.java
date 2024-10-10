package DiscountActivity;

import java.util.Scanner;

public class CalculateDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Are you a new customer? Y/N: ");
		boolean isNewCustomer = getUserInput();
		
		System.out.print("Are you a loyalty card holder? Y/N: ");
		boolean hasLoyaltyCard = getUserInput();
		
		System.out.print("Do you have a coupon? Y/N: ");
		boolean hasCoupon = getUserInput();
		
		long startTime = System.nanoTime();
		int discount = calculateDiscount(isNewCustomer, hasLoyaltyCard, hasCoupon);
		long endTime = System.nanoTime();
		System.out.println("Elapsed Time in ns: " + ((endTime - startTime)/1000));
		displayOutput(discount);
	}
	
	public static boolean getUserInput() {
		Scanner input = new Scanner(System.in);
		
		char userInput;
		
		do {
		userInput = input.next().charAt(0);
		if (userInput == 'Y' || userInput == 'y' ) {
			return true;
		}
		if (userInput == 'N' ||userInput == 'n') {
			return false;
		}
		System.err.print("Only Valid input are Y and N. Please Try Again: ");
		} while (userInput != 'Y' || userInput != 'y' ||
				userInput != 'N' || userInput != 'n');
		
		return false;
	}
	
	
	public static int calculateDiscount(boolean newCustomer, boolean loyaltyCardHolder, boolean couponHolder) {
		int newCustomerDiscount = 15;
		int loyaltyCardHolderDiscount = 10;
		int couponDiscount = 20;
		
		if (newCustomer) {
			if(loyaltyCardHolder) {
				return -1;
			}
			if(!loyaltyCardHolder && couponHolder) {
				return Math.max(newCustomerDiscount, couponDiscount);
			} 
			if (!loyaltyCardHolder && !couponHolder){
				return newCustomerDiscount;
			}
		}
		
		if (!newCustomer) {
			if(loyaltyCardHolder && couponHolder) {
				return loyaltyCardHolderDiscount + couponDiscount;
			} 
			if (loyaltyCardHolder && !couponHolder){ 
				return loyaltyCardHolderDiscount;
			}
			if(!loyaltyCardHolder && couponHolder) {
				return couponDiscount;
			} 
			if (!loyaltyCardHolder && !couponHolder) {
				return 0;
			
			}
		}
		
		return -1;
	}
	
	public static void displayOutput(int discount) {
		
		if (discount == -1) {
			System.out.println("Discount is not applicable. Please check input again.");
		}
		
		if (discount != -1) {
			System.out.println("Your total discount is : " + discount + "%.");
		}
	
	}
	
	
}
