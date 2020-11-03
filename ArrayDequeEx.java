package assignment4;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String args[]) {
		ArrayDeque<String>deque=new ArrayDeque<String>();
		deque.offer("rams");
		deque.offer("raj");
		deque.add("nik");
		deque.offerFirst("mik");
		System.out.println("After offerFirst traversal");
		for(String s:deque) {
			System.out.println(s+" ");
			
		}
		deque.pollLast();
		System.out.println("After pollLast() Traversal");
		for(String s:deque) {
			System.out.println(s+" ");
	}

}
}