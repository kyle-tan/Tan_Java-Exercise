package JavaExercise2;

public class Tan_Exercise2_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int days = 1; days <= 12; days++) {
			System.out.printf("On the " + nthDays(days) + " of Christmas my true love sent to me %n");
			trueLoveGift(days);
		}

	}
	
	public static String nthDays(int day) {
		String dayInWords ="";
		switch (day){
		case 1:
			dayInWords = "First";
			break;
		case 2:
			dayInWords = "Second";
			break;
		case 3:
			dayInWords = "Third";
			break;
		case 4:
			dayInWords = "Fourth";
			break;
		case 5:
			dayInWords = "Fifth";
			break;
		case 6:
			dayInWords = "Sixth";
			break;
		case 7:
			dayInWords = "Seventh";
			break;
		case 8:
			dayInWords = "Eight";
			break;
		case 9:
			dayInWords = "Ninth";
			break;
		case 10:
			dayInWords = "Tenth";
			break;
		case 11:
			dayInWords =  "Eleventh";
			break;
		case 12:
			dayInWords =  "Twelfeth";
			break;
		}
		return dayInWords;
	}
	public static void trueLoveGift(int day) {
		switch (day) {
		case 12:
			System.out.println("Twelve drummers drumming.");
		case 11:
			System.out.println("Eleven pipers piping.");
		case 10:
			System.out.println("Ten lords a-leaping.");
		case 9:
			System.out.println("Nine ladies dancing.");
		case 8:
			System.out.println("Eight maids a-milking.");
		case 7:
			System.out.println("Seven swans a-swimming.");
		case 6:
			System.out.println("Six geese a-laying.");
		case 5:
			System.out.println("Five gold rings.");
		case 4:
			System.out.println("Four calling birds.");
		case 3:
			System.out.println("Three french hens.");
		case 2:
			System.out.println("Two turtle doves.");
		case 1:
			System.out.println("A partridge in a pear tree.");
		}
	}
}
