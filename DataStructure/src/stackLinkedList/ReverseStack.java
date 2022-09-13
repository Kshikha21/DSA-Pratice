package stackLinkedList;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseStack {
	private static Stack<Integer> stack=new Stack<Integer>();
//	private static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {  
//		//ArrayList<Integer> list=new ArrayList<>();
//		 if(input.size()==0){
//	            return;
//	        }
//	        int temp=input.pop();
//	        System.out.println(temp +" temp ");
//	        
//	        reverseStack(input,extra);
//	        
//	        while(!input.empty()){
//	            int t=input.pop();
//	            extra.push(t);
//	        }
//	        input.push(temp);
//	         while(!extra.empty()){
//	            int t=extra.pop();
//	            input.push(t);
//	        }
//	    
//		
//	}

	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> helper=new Stack<>();
	
		for(int elem:arr) {
			stack.push(elem);
		}
		System.out.println("original" +stack);
	
	reverseStack(stack,helper);
	///reverseStackwithRecursion(stack,helper);
System.out.println(stack);
	while(!stack.empty()) {
		System.out.println(stack.pop());
	}
	
}

private static void reverseStackwithRecursionUsingExtraStack(Stack<Integer> input, Stack<Integer> extra) {  //using 1 helper stack &
	                                                                                                    //implicit recursion 
    if(input.size()<=1){
        return;
    }
      int temp=input.peek();
      input.pop();
      reverseStack(input,extra);
      while(!input.isEmpty()){
          extra.push(input.pop());
      }
      input.push(temp);
      while(!extra.isEmpty()){
          input.push(extra.pop());
      }
}
private static void reverseStackwithRecursionwithoutExtraStack(Stack<Integer> input) {   //using implicit recursion only 
	if(input.size()<=1) {
		return ;
	}
	int temp=input.peek();
	  input.pop();
	  reverseStackwithRecursionwithoutExtraStack(input);
	  insertAtBottom(temp);
}



private static void insertAtBottom(int temp) {
   if(stack.isEmpty()) {
	   stack.push(temp);
   }else {
	   int temp1=stack.peek();
	   stack.pop();
	   insertAtBottom(temp);
	   stack.push(temp1);
	   
   }
	
}

private static void reverseStack(Stack<Integer> stack, Stack<Integer> helper) {   //using 2 stacks as helper
	while(!stack.empty()) {    // 1 2 3 4 5  being 5 at top 
		
		  int temp=stack.pop();      
		  helper.push(temp);
	}
	System.out.println(helper);  // 5 4 3 2 1  being 1 at top  
	Stack<Integer> stack2=new Stack<Integer>();
	while(!helper.isEmpty()) {   //new stack 
		int temp=helper.pop();   
		stack2.push(temp);
	}
	System.out.println(stack2);  // 1 2 3 4 5 

	while(!stack2.empty()) {         
		int temp=stack2.pop();
		stack.push(temp);
	}
	System.out.println(stack); //5 4 3 2 1 
	
	
}

	}