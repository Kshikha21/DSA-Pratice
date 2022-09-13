package queueCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueues {
	public static void main(String[] args) {
	  Queue<Integer> input=new LinkedList<>();
	  int a[]= {10,20,30,40,50,60};
	  for(int elem:a) {
		  input.add(elem);
	  }
	//  Solution.reverseQueue(input);
	// input= Solution.reverseKElements(input,3);
	  
	  while(!input.isEmpty()) {
		  System.out.print(input.poll()+" ");
	  }
	}
	
	 

}
 class Solution {

	public static void reverseQueue(Queue<Integer> input) {
        if(input.size()<=1){
            return;
        }
        int temp=input.poll();
          reverseQueue(input);
          input.add(temp);
    
	}

	/*    trying reversive method to reverse the k elements 
	 * public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
	 * 
	 * 
	 * if(input.size()<=1){ return input; } int temp=input.poll(); Queue<Integer>
	 * smallerQueue=reverseKElements(input,k); smallerQueue.add(temp);
	 * input=removeElements(smallerQueue,k);
	 * 
	 * return input; } private static Queue<Integer> removeElements(Queue<Integer>
	 * input, int k) {
	 * 
	 * while(k>0 && !input.isEmpty()) { System.out.println(k); int
	 * temp=input.poll(); k--; removeElements(input,k); input.add(temp); } return
	 * input; }
	 */
	public static Queue<Integer> reverseKElementsUsingStack(Queue<Integer> input, int k) {
		if(input.size()<=1 || k>input.size()) {
			return input;
		}
		if(k<=0) {
			return input;
		}
		Stack<Integer>  stck=new Stack<Integer>();
		for(int i=0;i<k;i++) {
			stck.push(input.poll());
		}
		while(!stck.isEmpty()) {
			input.add(stck.pop());
		}
		for(int i=0;i<input.size()-k;i++) {
			input.add(input.poll());
		}
		return input;
	}

	


}
