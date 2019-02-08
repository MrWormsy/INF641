package fr.mrwormsy.inf641.tp1;

public class TP1 {
	
	public static void main(String[] args) {
		
		Bookshelf bookshelf = new Bookshelf();
		
		Author author1 = new Author("Gege", "Bleu", "Antillais");
		Author author2 = new Author("Kkour", "Le sang", "Perse");
		
		Book book1 = new Book("Test", author1, 0);
		Book book2 = new Book("Test2", author1, 0);
		Book book3 = new Book("Test3", author2, 0);
		
		People people1 = new People("Deny", "");
		People people2 = new People("Mary", "");
		People people3 = new People("Poupoule", "");
		
		Spell spell1 = new Spell("Boulle de feu");
		Spell spell2 = new Spell("Soin");
		
		people1.addSpell(spell1);
		people2.addSpell(spell2);
		
		people3.addSpell(spell1);
		people3.addSpell(spell2);
		
		book1.addPeople(people1);
		
		book2.addPeople(people1);
		book2.addPeople(people2);
		
		book3.addPeople(people1);
		book3.addPeople(people2);
		book3.addPeople(people3);
		
		
		bookshelf.addBook(book1);
		bookshelf.addBook(book2);
		
		bookshelf.displayAllBooks();
		
		bookshelf.addBook(book3);
		
		bookshelf.displayAllBooks();
	}
}
