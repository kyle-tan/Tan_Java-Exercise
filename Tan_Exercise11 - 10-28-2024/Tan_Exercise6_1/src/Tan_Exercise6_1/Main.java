package Tan_Exercise6_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee fullTime = new FullTimeEmployee("Pedro Penduko", 1, 100000);
		
		Employee partTime = new PartTimeEmployee("Victor Magtanggol", 15, 250.50, 144);
		
		Employee contractor = new Contractor("Aling Puring", 30, 375.75, 72);
		
		System.out.println("Full time employee " + fullTime.getName() + 
				"'s salary: " + fullTime.calculatePay());
		System.out.println("Part time employee " + partTime.getName() + 
				"'s salary: " + partTime.calculatePay());
		System.out.println("Contractor employee " + contractor.getName() + 
				"'s salary: " + contractor.calculatePay());
	}

}
