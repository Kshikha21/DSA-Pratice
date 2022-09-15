package queueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue<T>{
	private Queue<T> q1;
	private Queue<T> q2;
	 private int size;


	public StackUsing2Queue() {
		//Implement the Constructor
		q1=new LinkedList<>();
		q2=new LinkedList<>();
		  size=0;
	}



	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		return q1.size();

	}

	public boolean isEmpty() {

		return getSize()==0;

	}

	public void push(T element) {
		  while(!q1.isEmpty()) {
			  q2.add(q1.poll());
			 
		  }
		  q1.add(element);
		  while(!q2.isEmpty()) {
			  q1.add(q2.poll());
			  
		  }
      size++;
	}

	public T pop() {
		if(q1.size()==0) {
			return null;
		}
	 T element= q1.poll();
	 size--;
	 return element;

	}

	public T top() {
		if(getSize()>0) {
			return q1.peek();
		}
		
		return null;

	}
}