package assignment4;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("nik");
		hs.add("ram");
		hs.add("nav");
		hs.add("raj");
		hs.add("vish");
		hs.add("ram");
		hs.add("jak");
		hs.add("rik");
		System.out.println(hs);
		System.out.println("size of the set is:"+hs.size());
		System.out.println(hs.contains("raj"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("ram"));
		System.out.println(hs.clone());

	}

}
