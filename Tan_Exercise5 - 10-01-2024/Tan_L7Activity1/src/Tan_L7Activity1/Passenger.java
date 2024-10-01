package Tan_L7Activity1;

public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	
	public Passenger() {
		name = "Pedro";
		gender = 'f';
		nationality = "Japanese";
		dateOfBirth = "July 24, 2002";
		passport = new String[] {name, nationality, dateOfBirth};
	}
	
	public Passenger(String name, char gender, String nationality, String dateOfBirth, String[] passport) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.passport = passport;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String[] getPassport() {
		return passport;
	}
	public void setPassport(String[] passport) {
		this.passport = passport;
	}
	
}
