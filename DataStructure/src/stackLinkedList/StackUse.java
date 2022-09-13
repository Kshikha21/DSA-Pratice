package stackLinkedList;

import stackarray.StackEmptyException;

public class StackUse {
	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack=new StackUsingLL<>();

		
		stack.push(10);
		stack.push(20);
		System.out.println(stack.top());
		stack.pop();
	System.out.println(stack.size());	
		
		System.out.println(stack.pop());
		
		stack.isEmpty();
	
		System.out.println(stack.isEmpty());
	}

}
