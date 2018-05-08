package inheritance;

public class Person {
	private String mName;
	private int mAge;
	
	//protected Person() {
		
	//}
	
	public Person(String pName,int pAge) {
		this.mName = pName;
		this.mAge = pAge;
	}

	public String getName() {
		return mName;
	}

	public void setName(String pName) {
		mName = pName;
	}

	public int getAge() {
		return mAge;
	}

	public void setAge(int pAge) {
		mAge = pAge;
	}

	protected boolean isSmart() {
		return true;
	}
}
