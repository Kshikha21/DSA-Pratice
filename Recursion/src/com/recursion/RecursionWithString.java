package com.recursion;

public class RecursionWithString {
	public static String replaceChar(String s,char a,char b) {
		if(s.length()==0) {
			return s;
		}
		String smallOutput=replaceChar(s.substring(1),a,b);
		if(s.charAt(0)==a) {
			return b+smallOutput;
		}else {
			return s.charAt(0)+smallOutput;
		}
		
	}
	
	
	public static String removeX(String input){           //xaxb 
		// Write your code here
		int len=input.length();
   if(input.length()==0){
       return input;
   }
   String newString=removeX(input.substring(0,len-1));
   if(input.charAt(len-1)!='x'){
        return newString+input.charAt(len-1);
   }
   return newString;
   
}
	public static String removeXWithBetter(String input) {
		if(input.length()==0) {
			return input;
		}
		if(input.charAt(0)=='x') {
			return removeXWithBetter(input.substring(1));
		}
		return input.charAt(0)+removeXWithBetter(input.substring(1));
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(replaceChar("asdsgds",'s','x'));
		System.out.println(removeX("xaxb"));
	}

}
