package stackLinkedList;

import java.util.Stack;

public class Solution {
   private static Stack<Character> stack=new Stack<>();
    
	 public static boolean isBalanced(String str) {
	   for(int i=0;i<str.length();i++) {
		   char current=str.charAt(i);
		   if(isOpening(current)) {
			   stack.push(current);
		   }else {
			   if(stack.isEmpty()) {
				   return false;
			   }
			   else if(isMatching(stack.peek(),current)) {
				     stack.pop();
				   
			   }else {
				   return false;
			   }
		   }
	   }
	   if(stack.isEmpty()) {
		   return true;
	   }
	   return false;
	      
	    }

	private static boolean isMatching(Character peek, char current) {
		
		return (peek=='(' && current==')') ||
				peek=='{' && current=='}'  ||
				peek=='['  && current==']'
				;
	}

	private static boolean isOpening(char current) {
		return current=='(' ||
				current== '{' ||
				current== '[';
	}
  ////////////////2nd question for checking redundant brackets////////////////////////////
	public static boolean checkRedundantBrackets(String expression) {
		 Stack<Character> stack=new Stack<>();
	      
	        for(int i=0;i<expression.length();i++){
	              int count=0;
	           char current= expression.charAt(i);
	           
	            if(current!=')'){
	                 stack.push(current);
	                 
	            }else{

	                while(!isMatching1(stack.peek(),current)) {  //true
	                	count++;
	                	stack.pop();
	                	
	                }
	                if(isMatching1(stack.peek(),current) && count<=1){
	                   return true;
	                }
	                else if(isMatching1(stack.peek(),current)) {
	                	stack.pop();
	                }
               
	            }
	        }
	      
	        return false;
	    }
	    private static boolean isMatching1(Character c1,char current){
	         return (c1=='(' && current==')');
	    }
		
	}
	 