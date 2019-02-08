package fr.mrwormsy.inf641.tp1;

import java.util.ArrayList;

public class Author {
	
	private String name;
	private String surname;
	private String lang;
	private ArrayList<String> booksWriten;
	
	public Author(String name, String surname, String lang) {
		this.name = name;
		this.surname = surname;
		this.lang = lang;
		this.setBooksWriten(new ArrayList<String>());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getLang() {
		return lang;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public ArrayList<String> getBooksWriten() {
		return booksWriten;
	}
	
	public void setBooksWriten(ArrayList<String> booksWriten) {
		this.booksWriten = booksWriten;
	}
	
	public void addBookNameToAuthor(String bookName) {
		this.booksWriten.add(bookName);
	}
}
