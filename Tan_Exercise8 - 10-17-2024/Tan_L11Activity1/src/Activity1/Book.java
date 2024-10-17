package Activity1;

public class Book {
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	
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
		return String.format("%-30s%-20s%d\n",
                title, author, yearPublished);
	}
	
	public String toCSV() {
		return title + ","+author+","+yearPublished+"\n";
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

}
