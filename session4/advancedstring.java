package session4;

public class advancedstring {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb);
		//append
		sb.append("world");
		System.out.println("After Append: "+sb);
		//insert
		sb.insert(5,",");
		System.out.println("After Insert: "+sb);
		//replace
		sb.replace(6,11,"java");
		System.out.println("After replacement: "+sb);
		//reverse
		sb.reverse();
		System.out.println("After revarse: "+sb);
		
	}

}
