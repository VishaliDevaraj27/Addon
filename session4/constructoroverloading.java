package session4;

public class constructoroverloading {
	private String empname;
	private int empid;
	private String location;
	public constructoroverloading(String empname,int empid,String location) {
		this.empname= empname;
		this.empid=empid;
		this.location=location;
	}
	
	public constructoroverloading(String empname,int empid)
	{
		this(empname,empid,null);
		
	}
	public void displayInfo()
	{
		System.out.println("Empname:"+this.empname);
		System.out.println("Empid:"+this.empid);
		System.out.println("Location:"+this.location);
	}
	public static void main(String[] args) {
		constructoroverloading co= new constructoroverloading("Vishali devaraj",59,"saravanampatti");
		constructoroverloading cox= new constructoroverloading("Spiderman",02);
		co.displayInfo();
		cox.displayInfo();
		
	}
		
	
		
	
			}
