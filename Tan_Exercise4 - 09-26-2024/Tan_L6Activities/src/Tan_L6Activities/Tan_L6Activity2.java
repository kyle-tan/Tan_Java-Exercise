package Tan_L6Activities;

import java.util.Arrays;

public class Tan_L6Activity2 {
	static final int targetHours = 8;
	static int[] employeeList= {7,7,8,9,5,10};
	static int employeesThatMetTarget = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int goodEmployees = 0;
		for (int x = 0; x < employeeList.length; x++) {
			if(conditionsMet(employeeList[x])) {
				goodEmployees++;
			}
		}
		Tan_L6Activity2 obj = new Tan_L6Activity2();
		
		obj.printDetails(goodEmployees);
	}
	/**
	 * Function Name: printDetails
	 * Parameters: number of good employees
	 * 
	 * Inside the function:
	 * 	print array of employee working hours
	 * 	print target hours
	 * 	print total employees who met the target
	 * 	print good employees
	 * 
	 * Returns:
	 * 	1. void
	 */
	public void printDetails(int goodEmployees) {
		System.out.println("List of Employees: "+ Arrays.toString(employeeList));
		System.out.println("Target hours: "+ targetHours);
		System.out.println("Total Employees who met the target: "+goodEmployees+ " are the following: ");
		for (int x = 0; x < employeeList.length; x++) {
			if(employeeList[x] >= targetHours)
				System.out.println("Employee "+ x);
		}
	}
	/**
	 * Function Name: conditionsMet
	 * Parameter: number of working hours
	 * 
	 * Inside the function:
	 * 	1. check if workingHours is greater than or equal to target hours
	 * Returns:
	 * 	1. true if working hours is greater than or equal to target hours
	 * 	2. otherwise, false
	 */
	public static boolean conditionsMet(int workingHours) {
		if(workingHours >= targetHours) {
			return true;
		}
		return false;
	}
	
}
