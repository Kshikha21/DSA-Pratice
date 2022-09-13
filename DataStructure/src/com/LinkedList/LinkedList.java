package com.LinkedList;

public class LinkedList {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4= new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
//		System.out.println(n1.data);
//		System.out.println(n1.next);
//		System.out.println(n2.data);
//		System.out.println(n2.next);
//		System.out.println(n3.data);
//		System.out.println(n3.next);	
//		System.out.println(n4.data);
//		System.out.println(n4.next);
		
		return n1;
	}
	public static void printMethod(Node<Integer> n) {
		System.out.println(n.data);
		System.out.println(n.next.data);
		System.out.println(n.next.next.data);
		System.out.println(n.next.next.next.data);
		
	}
	public static void print(Node<Integer> n) {
		Node<Integer> temp=n;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void increment(Node<Integer> head) {
		Node<Integer> temp=head;
		
		while(temp!=null) {
			temp.data=temp.data+1;
			temp=temp.next;
		}
	
		
		
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head=createLinkedList();
	//	 printMethod(head);
		print(head);
		increment(head);
		
		print(head);
		
	}

}
