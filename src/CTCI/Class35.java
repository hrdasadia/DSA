package CTCI;

import java.util.Stack;

class SortStack {
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	@Override
	public String toString() {
		return "SortStack [s1=" + s1 + "]";
	}

	public int pop() {
		return s1.pop();
	}

	public void push(int a) {
		s1.push(a);
	}

	public int peek() {
		if (!s1.isEmpty()) {
			int a = s1.pop();
			s1.push(a);
			return a;
		}
		return -1;
	}

	public boolean isEmpty() {
		return s1.isEmpty();
	}

	public void sort() {
		while (!s1.isEmpty()) {
			int temp = s1.pop();
			if (s2.isEmpty()) {
				s2.push(temp);
			} else {
				while (!s2.isEmpty() && s2.peek() < temp) {
					s1.push(s2.pop());
				}
				s2.push(temp);
			}

		}
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}

	}

}


public class Class35 {

	
	
	public static void main(String[] args) {
		SortStack ss = new SortStack();
		ss.push(3);
		ss.push(5);
		ss.push(1);
		ss.push(7);
		ss.push(9);
		ss.push(17);
		ss.push(1);
		System.out.println(ss);
		ss.sort();
		
		System.out.println(ss);
	}

}
