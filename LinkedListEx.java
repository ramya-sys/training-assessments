package assignment4;
import java.util.LinkedList;

public class LinkedListEx{
	public static void main(String args[]) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(20);
		ll.addFirst(44);
		ll.add(32);
		ll.add(44);
		ll.addLast(30);
		ll.add(90);
		ll.add(20);
	    System.out.println(ll);
	    System.out.println(ll.element());
	    System.out.println(ll.pollFirst());
	    System.out.println(ll.pollLast());
	    System.out.println(ll.pop());
	    System.out.println(ll.offerFirst(20));
	    System.out.println(ll.offerLast(90));
	    System.out.println(ll);
	}
}
	    