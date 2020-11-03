package assignment4;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
	TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(33,"ram");
	tm.put(44,"nik");
	tm.put(54,"min");
	tm.put(65,"jak");
	tm.put(88,"nik");
	tm.put(66,"vin");
	tm.put(46,"raj");
	System.out.println("Before invoking remove() method");
	for(Entry<Integer, String> m:tm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	tm.remove(65);
	System.out.println("After invoking remove() method");
	for(Entry<Integer, String> m:tm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	}
		
	}

