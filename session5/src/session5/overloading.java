package session5;

public class overloading {
	int c;
	
	 public void add(int a, int b) {
		 
		 c = a + b;
		 System.out.println("the value of c:" +c);
		 
		 
	 }
	 public void add (float a , int b) {
		 float c = a+b;
		 System.out.println("the value of  float c:" +c);
		 
	 }
	 

	 public void add (float a , double b) {
		 double c = a+b;
		 System.out.println("the value of  double c:" +c);
		 
	 }
	 public static void main(String[] args) {
		overloading ol = new overloading();
		ol.add(7,9);
		ol.add(89.16f, 12);
		ol.add(86.675f, 524.678);
	}

	}


