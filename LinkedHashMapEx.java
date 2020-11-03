package assignment4;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
	
		LinkedHashMap<Integer,Integer>lhmap=new LinkedHashMap<Integer,Integer>();
		lhmap.put(20,30);
		lhmap.put(90,80);
		lhmap.put(43,44);
		lhmap.put(78,60);
		lhmap.put(30,50);
		System.out.println("key: "+lhmap.keySet());
	    System.out.println("values: "+lhmap.values());
		System.out.println("key-value pair: "+lhmap.entrySet());
		
		
	}

}
