package ex1;

public class Shelf {
	private String mFloor;
	// 0 sud, 1 nord, 2 est, 3 vest
	private int mCorner;
	private Book[] mBooks;

	public Shelf(String pFloor, int pCorner, Book[] pBooks) {
		super();
		mFloor = pFloor;
		mCorner = pCorner;
		mBooks = pBooks;
	}

	public String getFloor() {
		return mFloor;
	}

	public void setFloor(String pFloor) {
		mFloor = pFloor;
	}

	public int getCorner() {
		return mCorner;
	}

	public void setCorner(int pCorner) {
		mCorner = pCorner;
	}

	public Book[] getBooks() {
		return mBooks;
	}

	public void setBooks(Book[] pBooks) {
		mBooks = pBooks;
	}

	public int countBooks() {
		return mBooks.length;
	}

	public boolean hasTitle(String pTitle) {
		for (Book b : mBooks) {
			if (b.getTitle().equals(pTitle)) {
				return true;
			}
		}
		return false;
	}

	// DE FACUT
	///////////////////////////////////////////////////////////////////////////
	public boolean hasAuthor(String pAuthor) {
		for(int i=0; i<mBooks.length;i++) {
			if(pAuthor == mBooks[i].getAuthor()) {
				return true;
			}
		}
		return false;
		
	}
	
	public Book getBookByTitle(String pTitle) {
		// If Book exists return it's reference otherwise return NULL
		// TODO
		return null;
	}
}
