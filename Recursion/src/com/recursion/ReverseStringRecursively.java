package com.recursion;

public class ReverseStringRecursively {
	public static String reverseMethod(String str) {
		if(str.length()==1) {
			return str;
		}
		String rev=reverseMethod(str.substring(1));
		return rev+str.charAt(0);
		
	}

	public static void main(String[] args) {
		String val="hello";
		
		System.out.println(reverseMethod(val));
	}
}
