package fr.mrwormsy.inf641.tp1;

import java.util.ArrayList;

public class Book {

	private String title;
	private Author author;
	private int firstYearEdition;
	
	private ArrayList<People> peoples;
	
	public Book(String title, Author author, int firstYearEdition) {
		this.title = title;
		this.author = author;
		this.firstYearEdition = firstYearEdition;
		this.setPeoples(new ArrayList<People>());
		this.author.addBookNameToAuthor(title);
	}
	
	public Book(String title, Author author, int firstYearEdition, People people) {
		this.title = title;
		this.author = author;
		this.firstYearEdition = firstYearEdition;
		this.setPeoples(new ArrayList<People>());
		this.peoples.add(people);
		this.author.addBookNameToAuthor(title);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getFirstYearEdition() {
		return firstYearEdition;
	}

	public void setFirstYearEdition(int firstYearEdition) {
		this.firstYearEdition = firstYearEdition;
	}
		
	public ArrayList<People> getPeoples() {
		return peoples;
	}

	public void setPeoples(ArrayList<People> peoples) {
		this.peoples = peoples;
	}
	
	public void displayPeoples() {
		System.out.println(this.getTitle() + " contains :");
		for(People people : this.peoples) {
			System.out.println(" - " + people.getName());
		}
	}
	
	public void addPeople(People people) {
		this.peoples.add(people);
	}
	
	public boolean containsPeople(String name) {
		for(People people : this.peoples) {
			if (people.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
