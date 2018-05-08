package ex1;

public class BookLibrary {
	private String mName;
	private String mAddress;
	private Shelf[] mShelves;

	public BookLibrary(String pName, String pAddress, Shelf[] pShelves) {
		super();
		mName = pName;
		mAddress = pAddress;
		mShelves = pShelves;
	}

	public String getName() {
		return mName;
	}

	public void setName(String pName) {
		mName = pName;
	}

	public String getAddress() {
		return mAddress;
	}

	public void setAddress(String pAddress) {
		mAddress = pAddress;
	}

	public Shelf[] getShelves() {
		return mShelves;
	}

	public void setShelves(Shelf[] pShelves) {
		mShelves = pShelves;
	}

	public int countBooks() {
		int result = 0;
		for(Shelf s : mShelves) {
			result += s.countBooks();
		}
		return result;
	}
	
	public boolean hasTitle(String pTitle) {
		for(Shelf s : mShelves) {
			if(s.hasTitle(pTitle)) {
				return true;
			}
		}
		return false;
	}
	
	// DE FACUT
	/////////////////////////////////////////////////////////
	public boolean hasAuthor(String pAuthor) {
		// TODO
		return false;
	}
	
	public Book getBookByTitle(String pTitle) {
		// If Book exists return it's reference otherwise return NULL
		// TODO
		return null;
	}
}
