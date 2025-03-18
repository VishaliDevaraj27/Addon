package project;

public class Operators {

	public static void main(String[] args) {
		int a=6,b=10;
		//Arithmetic
		System.out.println("add:"+(a+b));
		System.out.println("sub:"+(a-b));
		System.out.println("multiply:"+(a*b));
		System.out.println("division:"+(a/b));
		//relational
		System.out.println("equal to:"+(a==b));
		System.out.println("greater than:"+(a>b));
		//logical
		boolean condition1=true,condition2=false;
		System.out.println("Logical AND:"+(condition1 && condition2));
		System.out.println("OR:"+(condition1 || condition2));
		System.out.println("NOT:"+(!condition1));
		//unary
		System.out.println("post decrement:"+(a--));
		System.out.println("pre increment:"+(++b));
		System.out.println("negation"+(~a));
		//assignment
		a-=4;
		System.out.println("assign:"+a);
		//ternary
		String res=(a>b)?"a is greater":"'b is greater'";
		System.out.println("result="+res);
		
	}
	
}
