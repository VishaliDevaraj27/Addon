package session5;

public class accessbirdaction extends bird implements flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Birds fly...");
		}
	public static void main(String[] args) {
		accessbirdaction aba = new accessbirdaction() ;
			aba.eat();
			aba.fly();
		}
		
	}


