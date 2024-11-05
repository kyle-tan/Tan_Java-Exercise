package Books;

import java.util.ArrayList;

public class BookRentalSystem {
	ArrayList<Book> library = new ArrayList<Book> ();
	
	public static void main (String[] args) {
		BookRentalSystem obj = new BookRentalSystem();
		
		obj.addBooks();
		obj.displayBooks();
		obj.rentedBooks();
	}
	
	public void addBooks() {
		library.add(new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954));
		library.add(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
		library.add(new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
		library.add(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997));
	}
	
	public void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for (Book i : library) {
			System.out.println(i.toString());
		}
		System.out.println();
	}
	
	public void rentedBooks() {
		System.out.println("* * * * * * * BOOKS RENTED, NEVER READ * * * * * * *");
		for (int x = 0; x < library.size(); x++) {
			if (library.get(x).getTitle().equalsIgnoreCase("The Lord of the Rings") || 
					library.get(x).getTitle().equalsIgnoreCase("The Tipping Point")) {
				
				library.get(x).rent();
			}
			
		}
		
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).isRented()) {
				System.out.println(library.get(i).toString());
			}
		}
	}
}
