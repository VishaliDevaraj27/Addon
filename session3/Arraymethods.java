package session3;

import java.util.Arrays;

public class Arraymethods {
	public static void main(String[] args) {
		//length of an array
		int[] num= {10,20,30,40,50,60};
		System.out.println("length of num:"+num.length);
		//copying an array
		int[] source= {1,2,3,4,5};
		int[] destination= new int[5];
		//copy array
				System.arraycopy(source,0,destination,0,source.length);
			for(int i:destination) {
					System.out.println(i+" ");
					}
		//array sort
			int[] b= {12,8,6,45,2};
			Arrays.sort(b);
			System.out.println(Arrays.toString(b));
			//array fill
			int[] d=new int[5];
			Arrays.fill(d,100);
			System.out.println(Arrays.toString(d));
			
			
			
	}

}
