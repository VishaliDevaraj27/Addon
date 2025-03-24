package session5;

public class accessperson {
	public static void main(String[] args) {
		
		//original person object
		person originalperson = new person("Reshma", 19);
		
		//copied person object
		
		person copiedperson = new person(originalperson);
		System.out.println("Original Person");
		originalperson.displayInfo();
		System.out.println("Copies Person");
		copiedperson.displayInfo();
	}

}
