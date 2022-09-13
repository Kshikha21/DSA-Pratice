package stackarray;

public class StackUsingArray {
	private int data[];   //no access to data to anyone 
	private int topIndex;


	public StackUsingArray() {
		data=new int[3];
		topIndex=-1; //index of top most elements in the array
	}
	public StackUsingArray(int size) {
		data=new int[size];
		topIndex=-1; 
	}
	
	//0(1)
	public void push(int element)  {
		if(topIndex==data.length-1) {

			 DoubleCapacity();
			//throw  new StackFullException("Exception occurred because Stack is Full!");
			//throw exception
		}

		topIndex++;
		data[topIndex]=element;
	}

	private void DoubleCapacity() {
		System.out.println("Welcome to double capacity");
		int temp[]=data;
		data=new int[2*temp.length];
		
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
		
	}

	//0(1)
	public int size() {
		int len=topIndex+1;

		return len;
	}
	
	//0(1)
	public int top() throws StackEmptyException {
		if(topIndex==-1) {
			throw new StackEmptyException("Exception occurred because Stack is Empty!");
		}
		int value=data[topIndex];
		return value;
	}
	//0(1)
	public int pop() throws StackEmptyException {
		if(topIndex==-1) {
			throw new StackEmptyException("Exception occurred because Stack is Empty!");
		}
		int value=data[topIndex];
		data[topIndex]=0;
		topIndex--;

		return value;
	}
	
	//0(1)
	public boolean isEmpty() {
		if(topIndex==-1) {
			return true;
		}
		return false;
	}

}
