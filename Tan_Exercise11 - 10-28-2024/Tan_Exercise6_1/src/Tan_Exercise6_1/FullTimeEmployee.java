package Tan_Exercise6_1;

public class FullTimeEmployee extends Employee{
	private double monthlySalary;

	public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
		super(name, employeeId, 0);
		this.monthlySalary = monthlySalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

}
