package exception;

public class OutOfBoundDigitsException extends Exception {
	public OutOfBoundDigitsException(String message) {
		super(message);
	}
	
	public static void validateDigits (long number) throws OutOfBoundDigitsException {
		String str;
		int str_length;
		boolean isValid = false;
		
		//Converts long to String
		str = Long.toString(number);
		
		//finds the length of the converted String
		str_length = str.length();
		
		//Checks if length of inputted number is equals to 10. If true, update the isValid to true
		if(str_length == 10) {
			isValid = true;
		}
		
		//Checks if isValid returns true it will throw the exception
		if (!isValid) {
			throw new OutOfBoundDigitsException("Invalid phone number! Only 10-digit number is allowed");
		}
	}
}
