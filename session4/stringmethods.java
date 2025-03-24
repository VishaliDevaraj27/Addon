package session4;

import java.util.Scanner;

public class stringmethods {

	public static void main(String[] args) {
		String s1="Java ";
		String s2="Python";
		String s3="Python";
//		String s4=s1+s3;
		s1=s1+s2;
		System.out.println(s1);
		
		
		String s4="Computer Science";
		//length
		System.out.println(s4.length());
		 
		//equals
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String username=sc.nextLine();
		
		System.out.println("Enter Password");
		String password = sc.next();
		 if (username.equalsIgnoreCase("admin") && password.equals("admin@123")) {
			 System.out.println("Success");
			 }
		 else {
			 System.out.println("Error 404!");
		 }
		 
		
		 //=="Equals" 
		 String s5="Program";
		 String s6="code";
		 String s7="Program";
		System.out.println(s5==s7);
		 System.out.println(s5==s6);
		String name = new String("Computer");
		String name1=new String("Computer");
		 System.out.println(name1==name);
		 
		 //compareTo
		 String s8="hello";
		 String s9="world";
		 System.out.println(s8.compareTo(s9));
		 
		 //concat
		 String str1="String" ;
		 String Str2=new String("Program");
		 System.out.println(str1.concat(Str2));
		 
		 //toCharArray
		 String str3="Welcome";
		 System.out.println("home");
		 char[] ch=str3.toCharArray();
		 for(char str:ch) {
			 System.out.println(str);
		 }
		 System.out.println(str3.toCharArray());
		 //substring
		 String s10="Vishali Devaraj";
		 System.out.println(s10.substring(2,10));
		 
		 //intern
		 String clg="kgcas";
		 String clg1=new String("kgcas");
		 String str4=clg1.intern();
		 System.out.println(clg==str4);
		 }
}



