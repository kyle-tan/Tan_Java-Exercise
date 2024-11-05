package Books;

import java.util.Date;

public class Book {
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	private Date returnedDate;
	private Date dueDate;
	private double fine;
	
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		isRented = false;
	}
	
	public void rent() {
		isRented = true;
	}
	
	public String toString() {
		return String.format("%-30s%-20s%d",
                title, author, yearPublished);
	}
	
	public String toStringRent() {
		return String.format("%-30s%-20s%d Due Date: %-10F Returned Date: %-10F Fine: %-2f",
                title, author, yearPublished, dueDate, returnedDate, fine);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public boolean isRented() {
		return isRented;
	}
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

	public Date getReturnDate() {
		return returnedDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnedDate = returnDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}
	
	

}
