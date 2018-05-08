package ex1;

public class Main {

	public static void main(String[] args) {
		// Generam o instanta de biblioteca
		BookLibrary library = new BookLibrary("Universitara",
				"Bucuresti",
				new Shelf[] {
					new Shelf("First", 0, new Book[] {
							new Book("Morometii", "Marin Preda", "RAO", 2015, 800),
							new Book("Harap Alb", "Creanga Ion", "RAO", 2009, 150)
					}),
					new Shelf("First", 1, new Book[] {
							new Book("Crima si pedeapsa", "Dostoievski", "RAO", 2015, 500)
					})
				
				});
		System.out.println("Numar carti:" + library.countBooks());
		System.out.println("exista Morometii ? :" + library.hasTitle("Morometii"));
		System.out.println("exista Povesti nemuritoare ? :" + library.hasTitle("Povesti nemuritoare"));
		if(library.hasTitle("Morometii")) {
			Book book = library.getBookByTitle("Morometii");
			// TODO
			// print book num pages, author //
		}
		
		
		//Book b1 = new Book(.args.clone().)
		//Book b2 = new Book(....)
		//Book[] bs1 = new Book[] {b1,b2}
		// Shelf s1 = new Shelf(...,bs1);
		// Library l = new Library(..s1);
	}

}
