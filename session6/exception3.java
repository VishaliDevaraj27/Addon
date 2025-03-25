package session6;

public class exception3 {

	static void validateAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Age must be above 18");
		}else{
			System.out.println("Valid age");
		}
	}
	public static void main(String[] args) {
		try {
			validateAge(12);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught an exception:" +e.getMessage());
		}
	}
}
