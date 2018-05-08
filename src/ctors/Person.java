package ctors;

public class Person {
	private String name;
	private int age;
	
	private Person() {
		this.age = 33;
	}
		
	public Person(String pName,int pAge) {
		this.name = pName;
		this.age = pAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// FACTORY PATTERN
	static Person __personInstance = null;
	
	public static Person getOnePerson() {
		if(__personInstance == null) {
			__personInstance = new Person();
		}
		return __personInstance;
	}
}
