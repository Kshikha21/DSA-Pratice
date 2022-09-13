package com.recursion;

public class TowerOfHanoiClass {
	
	public static void towerOfHanoi(int n,char a,char b,char c) {
		if(n==1) {
		  System.out.println("move 1st disk from source "+ a +" to destination"+ c);
		return;
		}
	  towerOfHanoi(n-1,a,c,b);
	  System.out.println("move"+ n +"th disk from source "+ a +" to destination "+ c);
	  towerOfHanoi(n-1,b,a,c);
	}
	
	

	public static void main(String[] args) {
		towerOfHanoi(3, 'a','b' , 'c');
		
	}

}
