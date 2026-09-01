package entities;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private BookStatus currentStatus;
	
	public Book() {
		
	}
	
	
	public Book(String author, String title,String isbn, BookStatus currentStatus) {
	
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.currentStatus = currentStatus;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public BookStatus getCurrentStatus() {
		return currentStatus;
	}


	public void setCurrentStatus(BookStatus currentStatus) {
		this.currentStatus = currentStatus;
	}


	
	

}
