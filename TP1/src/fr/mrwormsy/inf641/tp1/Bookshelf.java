package fr.mrwormsy.inf641.tp1;

import java.util.ArrayList;

public class Bookshelf {

	private ArrayList<Book> books;

	public Bookshelf() {
		this.setBooks(new ArrayList<Book>());
	}
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public boolean isBookInTheBookshelf(String name) {
		for(Book book : this.books) {
			if (book.getTitle().equalsIgnoreCase(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void displayAllBooks() {
		System.out.println("The books in this bookshelf are : ");
		for(Book book : this.books) {
			System.out.println(" - " + book.getTitle());
		}
	}
	
	public void displayAllBooksFromAuthor(String author) {
		System.out.println("The books of " + author + " in this bookshelf are : ");
		for(Book book : this.books) {
			if (book.getAuthor().getName().equalsIgnoreCase(author)) {
				System.out.println(" - " + book.getTitle());
			}
		}
	}
	
}
