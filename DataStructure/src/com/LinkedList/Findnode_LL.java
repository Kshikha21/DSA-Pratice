package com.LinkedList;

import java.util.Scanner;

class Solution {
	 public static LinkedListNode<Integer> takeInput(){
			LinkedListNode<Integer> head1 = null,tail=null;
			Scanner sc=new Scanner(System.in);
			int data=sc.nextInt();
			
			while(data!=-1) {
			LinkedListNode<Integer> currentNode=new LinkedListNode<Integer>(data);
			if(head1==null){ ///first node or not 
			head1=currentNode;
			tail=currentNode;
			}
			else {
			
				tail.next=currentNode;
				tail=currentNode; //tail=tail.next;
				
			}
				data=sc.nextInt();
			}
		return head1;
		}


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    
         return findNodeRec(head,n,0);
        
	}
    public static int findNodeRec(LinkedListNode<Integer> head, int n,int index) {
    	index=0;
        if(head==null){
            return -1;
        }
        if(head.next==null){
            return -1;
        }
        if(head.data==n){
             return index;
        }
       index++;
    
         return index+findNodeRec(head.next,n,index);
        
    }
}

public class Findnode_LL {

	public static void main(String[] args) {
		LinkedListNode<Integer> t1=Solution.takeInput();
		int t=Solution.findNodeRec(t1,2);
		System.out.println(t);
		
	
	

	}

}
