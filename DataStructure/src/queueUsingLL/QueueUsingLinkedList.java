package queueUsingLL;

import com.LinkedList.Node;

public class QueueUsingLinkedList<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLinkedList() {
		front=null;
		rear=null;
		size=0;	
	}
	public int size() {	 //0(1)
		return size;
	}
	public boolean isEmpty() {  //0(1)
		return size==0;
	}
	public void enqueue(T elem) {
		Node<T> newNode=new Node<>(elem);
		size++;
		if(front==null) {
			front=newNode;
			rear=newNode;
			newNode.next=null;
			
		}else {
			rear.next=newNode;
			rear=newNode;  //rear=rear.next;
			newNode.next=null;
			
		}
			
}
	public T  front() {
		if(size==0) {
			return null;
		}
		return front.data;
	}
	public T dequeue() {
		if(front ==null) {
			System.out.println("no element to delete");
		}
		T data=front.data;
		front=front.next;
		if(front== null) {
			rear=null;
		}
		size--;
		return data;
	}
}