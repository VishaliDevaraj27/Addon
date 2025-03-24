package session5;

public class wrapperclass {
	public static void main(String[] args) {
		
		//converting primitive into wrapper class
		Integer intObj = 50;
		int a = Integer.valueOf(90);
		
		Character charObj = 'A';
		
		Double dObj = 56.89776;
		
		System.out.println(a);
		System.out.println(intObj);
		System.out.println(charObj);
		System.out.println(dObj);
		
		
		// converting wrapperclass into primitive
		
		int value1 =intObj;
		char value2 = charObj;
		double value3 = dObj;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// using utility method from wrapper class
		
		int parseInt = Integer.parseInt("12345");
		double parseDouble = Double.parseDouble("877.78657");
		boolean parseBoolean = Boolean.parseBoolean("true");
		System.out.println(parseInt);
		System.out.println(parseDouble);
		System.out.println(parseBoolean);
	}

}
