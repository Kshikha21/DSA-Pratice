package stackLinkedList;
import com.LinkedList.Node;

import stackarray.StackEmptyException;

public class StackUsingLL<T> {     //generic type 
	private Node<T> head;
	private int size; //to keep track of the size otherwise we have to travel each time to end to calculate size which will be 0(n) 
	
	public StackUsingLL() {
		head=null;
		size=0;
	}
	
   public int size() {
	   return size;
	   
   }
   public boolean isEmpty() {
	  return size==0;
   }
   public void push(T element) {
	   Node<T> newNode=new Node<T>(element);
	   newNode.next=head;
	   head=newNode;
	   size++;
	   
   }
   public T pop() throws StackEmptyException{
	   if(head==null) {
		   throw new StackEmptyException("Exception occurred stack is empty!");
	   }
	  T temp=head.data;
	  head=head.next;
	  size--;
	   return temp;
	   
   }
   public T top() throws StackEmptyException{
	   if(head==null) {
		   throw new StackEmptyException("Exception occurred stack is empty!");
	   }
	   return head.data;
	   
   }
}
