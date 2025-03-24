package session5;

public class person {
	
	private String name;
	private int age;
	
	 //Regular constructor
	public person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	// copy constructor
	public person(person other) {
		this.name = other.name;
		this.age = other.age;              
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	//Method to display details
	public void displayInfo() {
		System.out.println("Name" +name+"'Age" +age );
	}
	
	
	
	
	
}
