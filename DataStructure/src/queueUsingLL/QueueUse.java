package queueUsingLL;

import queueCollection.QueueUsing2Stacks;
import queueCollection.StackUsing2Queue;

public class QueueUse {
  public static void main(String[] args) {
//	QueueUsingLinkedList<Integer> queue=new QueueUsingLinkedList<>();
//	
//	int a[]= {10,20,30,40};
//	for(int elem:a) {
//		queue.enqueue(elem);
//	}
//	System.out.println(queue.size());
//	System.out.println("front element"+queue.front());
//	while(!queue.isEmpty()) {
//		System.out.println(queue.dequeue());
//	}
	  /************   QueueUSing2Stack ***************/
//	  QueueUsing2Stacks<Integer> sq=new QueueUsing2Stacks<>();
//	  int a[]= {10,20,30,40};
//	  for(int elem:a) {
//		  sq.push(elem);
//	  }
//	  System.out.println("size of the queue: "+sq.getSize());
//	  
//     
//   
//     System.out.println("First elemet of the queue: "+sq.top());
//     while(!sq.isEmpty()) {
//    	 System.out.println(sq.pop());
//     }
	  /************   StackUSing2Queue ***************/
	  StackUsing2Queue<Integer> q=new StackUsing2Queue<>();
	  int a[]= {10,20,30,40};
	  for(int elem:a) {
		  q.push(elem);
		  System.out.println(q.getSize());
	  }
	 System.out.println(q.top());
}}
