package inheritance;

public class Student extends Person {
	private String mCourseName;
	private int mGrade;
	
	
	
	public Student(String pName, int pAge, String pCourseName, int pGrade) {
		super(pName, pAge);
		mCourseName = pCourseName;
		mGrade = pGrade;
	}


	/**
	public Student(String pName,int pAge,String pCourseName,int pGrade) {
		super(pName,pAge);
		this.mCourseName = pCourseName;
		this.mGrade = pGrade;
	}
	*/
	
	public Student(String pName,int pAge,String pCourseName) {
		this(pName,pAge,pCourseName,10);
	}


	public String getCourseName() {
		return mCourseName;
	}

	public void setCourseName(String pCourseName) {
		mCourseName = pCourseName;
	}

	public int getGrade() {
		return mGrade;
	}

	public void setGrade(int pGrade) {
		mGrade = pGrade;
	}
	
	@Override
	public boolean isSmart() {
		return super.isSmart();
	}
}
