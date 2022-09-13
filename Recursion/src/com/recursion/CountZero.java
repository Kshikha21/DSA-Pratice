package com.recursion;

public class CountZero {
	public static int countZerosRec(int input){
		// Write your code here
        if(input==0){
            return 0;
        }
        if(input%10==0){
            return countZerosRec(input/10)+1;
        }else{
            return countZerosRec(input/10);
        }}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(countZerosRec(0));
	}

}
