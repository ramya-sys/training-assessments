package assignment4;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(4);
		st.push(9);
		st.push(8);
		st.push(19);
		st.push(17);
		st.push(4);
		st.push(6);
		st.push(14);
		System.out.println(st);
        System.out.println(st.pop());
		System.out.println(st.empty());
		System.out.println(st.peek());
		System.out.println(st.search(17));
		System.out.println(st);


	}

}
