package session5;

public class calculator {
 
	// by changing the number of arguments
	public int add( int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		
		calculator c = new calculator();
		System.out.println(c.add(6,7));
		System.out.println(c.add(5,9,20));
		
	}
}
