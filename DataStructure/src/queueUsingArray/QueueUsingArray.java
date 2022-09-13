package queueUsingArray;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;

	
	public QueueUsingArray() {
		data=new int[5];
		 front=-1;
		rear=-1;
	}
	public QueueUsingArray(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
	}
	public int size() {  ///0(1)
		return size;
	}
	public boolean isEmpty() {   //0(1)
		return size==0;
	}
	public void enqueue(int element)  {
		if(size==data.length) {
			//throw new QueueFullException();
			doubleCapacity();
		}
		if(size==0) {     //0(1)
           front++;
		}
//		rear++;
//		if(rear==data.length) {
//			rear=0;
//		}                         //try below method 
		rear=(rear+1)%data.length;
		data[rear]=element;
		size++;
	}
	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		int index=0;
	for(int i=front;i<temp.length;i++) {  //copying from front to length
		data[index++]=temp[i];
	}
	for(int i=0;i<front-1;i++) {  ///copying from 0 to front-1 when rear is at begning
		
		data[index++]=temp[i];
	}
	front=0;
	rear=temp.length-1;
		
		
	}
	public int front() throws QueueEmptyException { //0(1)
		if(size==0) {
			throw new QueueEmptyException();
		}
			return data[front];
		
	}
	public int dequeue() throws QueueEmptyException {  //0(1)
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp=data[front];
		front++;
		if(front==data.length) {
			front=0;
		}
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
		
	}
	
	
	
}
