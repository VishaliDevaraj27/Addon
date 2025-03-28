package session7;

public abstract class throwsex {
	
	public static int divideNumber(int m,int n) throws
	ArithmeticException, ArrayIndexOutOfBoundsException {
		int div =m/n;
		
		String[] name = {"java","python","node"};
		System.out.println(name[7]);
		return div;
		
		
	}
	public static void main(String[] args) {
		// throwsex te =new throwsex();
		try {
			System.out.println(divideNumber(3,8));
		}catch(ArithmeticException e) {
			System.out.println("no cannot be divisible by 0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
	}

}
