package project;

public class bitwise {
	public static void main(String[] args) {
		// unary
		int a = 10, c = 20, b;
		System.out.println("result:" + (b = a++ + --c + ++a));
		int x=5,y=3;//5-->0101  3-->0011
		System.out.println("Bitwise AND:"+(x&y));
		System.out.println("OR:"+(x|y));
		System.out.println("XOR:"+(x^y));
		System.out.println("NOT"+(~x));
	}

}
