package session4;

public class constructor {
	
		public constructor() {
			System.out.println("Default constructor");
				}
		public constructor(String name,String age) {
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Parameterized constructor");
		}

		public int sum(int a,int b){
		int res=a+b;
		return res;
		}
		public static void main(String[] args) {
			constructor ce =new constructor();
			System.out.println(ce.sum(5, 10));
			constructor cx=new constructor("Vishali Devaraj","18");
			

			
		}
	}


