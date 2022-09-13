package queueCollection;

import java.util.Stack;

public class QueueUsing2Stacks<T> {
	private Stack<T> s1;
	private Stack<T> s2;
	private int size;
	public QueueUsing2Stacks() {
		s1=new Stack<>();
		s2=new Stack<>();
		size=0;
	}

	public int getSize() { 
		//Implement the getSize() function


		return size;
	}

	public boolean isEmpty() {
		//Implement the isEmpty() function
		return size==0;
	}

	public void push(T element) {
		//Implement the push(element) function
		s1.push(element);
		size++;

	}

	public T pop() {
		T data=null;
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		data=s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	
		size--;
		return data;
	}

	public T top() {
		T data=null;
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		data=s2.peek();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return data;
	}


}
