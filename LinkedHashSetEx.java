package assignment4;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(8);
		lhs.add(24);
		lhs.add(8);
		lhs.add(24);
		lhs.add(28);
		lhs.add(14);
		lhs.add(55);
		lhs.add(87);
		lhs.add(88);
		lhs.add(14);
		System.out.println();
		System.out.println("size of the set is: "+lhs.size());
		System.out.println(lhs.contains(90));
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.remove(14));
	

}
}