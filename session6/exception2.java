package session6;

public class exception2 {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to divide by 0...");
			int res = 10/0;    //thrpws arithmetic exception
			System.out.println("Result is"+res);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Final block executed...");
		}
	}

}
