package queueUsingArray;

public class QueueUse {
  
	public static void main(String[] args) throws QueueEmptyException {
//		   Queue<Integer> q=new LinkedList<Integer>();
//	        Stack<Integer> s=new Stack<Integer>();
//	        q.add(5);
//	        q.add(10);
//	        s.push(10);
//	        s.push(20);
//	        System.out.print(q.peek()+s.pop());
		
		QueueUsingArray q=new QueueUsingArray();
		int a[]= {10,1,12,30,2};
		for(int elem:a) {
		  q.enqueue(elem);
		}
		int len=q.size();
		System.out.println("size of the queue "+len);
		
		int first_element=q.front();
		System.out.println("first element of the queue "+first_element);  
		
		while(!q.isEmpty()) {
			int temp=q.dequeue();
			System.out.println(temp);
		}
	}
}


