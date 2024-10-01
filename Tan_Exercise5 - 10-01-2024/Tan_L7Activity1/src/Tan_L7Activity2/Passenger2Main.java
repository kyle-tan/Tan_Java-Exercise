package Tan_L7Activity2;

public class Passenger2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger passenger = new Passenger("Viktor Magtatanggol", 'M',"Canadian","June 12, 1898");
		System.out.println(passenger.toString());
		System.out.println();
		passenger =  new Passenger("Vicky Mananaggal", 'F',"Canadian","June 12, 1898", 1234567890);
		System.out.println(passenger.toString());
	}

}

