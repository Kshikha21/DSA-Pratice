package com.recursion;

public class Digits {

	public static int sumOfDigits(int input){
		// Write your code here
		// Write your code here
		  if(input==0){
		      return 0;
		  }
		       
		       int smallerElement = input%10;
		        return smallerElement + sumOfDigits(input/10);
		        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println( sumOfDigits(100));
	}

}
