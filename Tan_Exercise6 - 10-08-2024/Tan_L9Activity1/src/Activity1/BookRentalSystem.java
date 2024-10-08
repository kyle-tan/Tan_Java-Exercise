package Activity1;

public class BookRentalSystem {
	static Book[] book = {new FictionBook("The Lord of the Rings",
			"J.R.R. Tolkien", 1954),
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			 new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			 new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)};
	
	public static void main (String[] args) {
		
		displayBooks();
		rentedBooks();
	}
	
	
	public static void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for (Book i : book) {
			System.out.println(i.toString());
		}
		System.out.println();
	}
	
	public static void rentedBooks() {
		System.out.println("* * * * * * * BOOKS RENTED, NEVER READ * * * * * * *");
		for (Book i: book) {
			if (i.getTitle().equalsIgnoreCase("The Lord of the Rings") || 
					i.getTitle().equalsIgnoreCase("The Tipping Point")) {
				i.rent();
			}
			
		}
		
		for (Book i: book) {
			if (i.isRented()) {
				System.out.println(i.toString());
			}
		}
	}

}
