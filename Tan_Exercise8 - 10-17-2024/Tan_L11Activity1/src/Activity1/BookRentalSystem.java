package Activity1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BookRentalSystem {
	static Book[] book = {
			new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954),
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			 new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			 new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)};
	
	public static void main (String[] args) throws IOException {
		writeToFile();
		readFromFile();
		
	}
	
	public static void rentedBooks() {
		for (Book i: book) {
			if (i.getTitle().equalsIgnoreCase("The Lord of the Rings") || 
					i.getTitle().equalsIgnoreCase("The Tipping Point")) {
				i.rent();
			}
			
		}
	}
	
	public static void writeToFile() throws IOException {
		File fileObject = new File("library.txt");
		FileWriter fw = new FileWriter(fileObject);
		fw.write("* * * * * * * * * * L I B R A R Y * * * * * * * * * *\n");
		for(Book i : book) {
			fw.write(i.toString());
		}
		fw.write("\n");
		fw.write("* * * * * * * BOOKS RENTED, NEVER READ * * * * * * *\n");
		for (Book i : book) {
			rentedBooks();
			if (i.isRented()) {
				 fw.write(i.toString());
			}
		}
		fw.flush();
		fw.close();
		
	}
	
	public static void readFromFile() throws FileNotFoundException {
		FileReader fr = new FileReader("library.txt");
		BufferedReader br = new BufferedReader(fr);
		try {
			String text = br.readLine();
			while (text != null) {
				System.out.println(text.toString());
				text = br.readLine();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
