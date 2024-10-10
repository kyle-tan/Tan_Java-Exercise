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
		System.out.println("Elapsed Time in ns: " + (endTime - startTime));
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
//		return newCustomer ? loyaltyCardHolder ? -1 : couponHolder ? 
//				Math.max(newCustomerDiscount, couponDiscount) : newCustomerDiscount : 
//					loyaltyCardHolder ? couponHolder ? loyaltyCardHolderDiscount + couponDiscount :
//						loyaltyCardHolderDiscount : couponHolder ? couponDiscount : 0;
		
		if (newCustomer) {
			if(loyaltyCardHolder) {
				if (couponHolder || !couponHolder) {
					return -1;
				}
			}
			if(!loyaltyCardHolder) {
				if (couponHolder) {
					return Math.max(newCustomerDiscount, couponDiscount);
				}
				if(!couponHolder) {
					return newCustomerDiscount;
				}
			}
		}
		
		if (!newCustomer) {
			if(loyaltyCardHolder) {
				if (couponHolder) {
					return loyaltyCardHolderDiscount + couponDiscount;
				} 
				if (!couponHolder) {
					return loyaltyCardHolderDiscount;
				}
			}
			if(!loyaltyCardHolder) {
				if (couponHolder) {
					return couponDiscount;
				}
				if(!couponHolder) {
					return 0;
				}
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
