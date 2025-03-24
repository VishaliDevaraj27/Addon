package session5;

public class accessfoodmenu implements vegitems, nonvegitems {

	@Override
	public void fry() {
		// TODO Auto-generated method stub
	System.out.println("Cauliflower fry");	
	}

	@Override
	public void gravy() {
		// TODO Auto-generated method stub
		System.out.println("paneer gravy");
		
	}

	@Override
	public void breakfast() {
		// TODO Auto-generated method stub
		System.out.println("Poori with masal");
		
	}

	@Override
	public void lunch() {
		// TODO Auto-generated method stub
		System.out.println("Mushroom biriyani");
		
	}
	public static void main(String[] args) {
		accessfoodmenu fm = new accessfoodmenu();
		fm.breakfast();
		fm.lunch();
		fm.gravy();
		fm.fry();
		
	}

}
