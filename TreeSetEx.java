package assignment4;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
	TreeSet<String>treeset=new TreeSet<String>();
	treeset.add("ram");
	treeset.add("nik");
	treeset.add("nik");
	treeset.add("raj");
	treeset.add("lin");
	treeset.add("jak");
	System.out.println(treeset);
	System.out.println("size of the set is:"+ treeset.size());
	System.out.println(treeset.isEmpty());
	System.out.println(treeset.contains("jak"));
	System.out.println(treeset.remove("lin"));
	System.out.println(treeset.add("vim"));
	System.out.println(treeset.subSet("lin",true,"raj",false));
	System.out.println(treeset.headSet("lin",false));
	System.out.println(treeset.tailSet("raj",true));
	System.out.println(treeset.first());
	System.out.println(treeset.last());
	System.out.println(treeset.floor("raj"));
	System.out.println(treeset.pollFirst());
	System.out.println(treeset.pollLast());
	System.out.println(treeset.lower("nik"));
	System.out.println(treeset.ceiling("lin"));
	System.out.println(treeset.higher("jak"));
	
	

	}

}
