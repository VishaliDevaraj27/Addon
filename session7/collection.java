package session7;

import java.util.*;

public class collection {
	
	//adding and accessing elements in collection
	public static void main(String[] args) {
		//list example
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("node");
		System.out.println("List:" +list);
	// set example
		Set<String> set = new HashSet<>();
		
		set.add("Yamaha");
		set.add("RE");
		set.add("Jawa");
		System.out.println("Set:" +set);
		// map example
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Reshma");
		map.put(2, "Easwaran");
		map.put(3, "Priya");
		System.out.println("Map:" +map);
	}

}
