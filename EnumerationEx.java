package assignment4;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(4);
		vector.add(38);
	    vector.add(12);
	    vector.add(6);
	    vector.add(32);
	    Enumeration<Integer> ev=vector.elements();
	    while(ev.hasMoreElements()) {
	    	System.out.println(ev.nextElement());
	    }
	    
	    System.out.println(vector.capacity());
	    System.out.println(vector.firstElement());
	    System.out.println(vector.lastElement());
	    System.out.println(vector.get(2));
	    vector.set(0,20);
	    System.out.println(vector.hashCode());
	    System.out.println(vector.remove(1));
	    System.out.println(vector);
	}
}