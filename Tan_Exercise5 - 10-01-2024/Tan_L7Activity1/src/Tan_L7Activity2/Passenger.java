package Tan_L7Activity2;

public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	public long pwdIDNumber;
	
	public Passenger() {
		this("kyle", 'M', "Filipino", "January 1, 1900", 2000567);
	}
	
	public Passenger(String name, char gender, String nationality, String dateOfBirth) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Passenger(String name, char gender, String nationality, String dateOfBirth, long pwdIDNumber) {
		this(name, gender, nationality,dateOfBirth);
		this.pwdIDNumber = pwdIDNumber;
		
	}
	
	public String toString() {
		return pwdIDNumber == 0 ? "Name: " + name +
				"\nGender: " + gender +
				"\nNationality: " + nationality +
				"\nDate of Birth: " + dateOfBirth :
				"Name: " + name +
				"\nGender: " + gender +
				"\nNationality: " + nationality +
				"\nDate of Birth: " + dateOfBirth +
				"\nPwD ID No.:  " + pwdIDNumber;
	}
	
}
