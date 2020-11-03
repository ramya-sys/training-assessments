package assignment4;

import java.util.Vector;

public class VecctorEx {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(33);
		vector.add(34);
	    vector.add(54);
	    vector.add(55);
	    vector.add(22);
	    System.out.println(vector.capacity());
	    System.out.println(vector.firstElement());
	    System.out.println(vector.lastElement());
	    System.out.println(vector.get(3));
	    vector.set(3,30);
	    System.out.println(vector.hashCode());
	    System.out.println(vector.remove(1));
	    System.out.println(vector);
	}
}