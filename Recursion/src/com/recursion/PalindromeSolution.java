package com.recursion;

public class PalindromeSolution {
	public static boolean isStringPalindrome(String input) {
		// Write your code here
          		// Write your code here
       
   return isStringPalindrome(input,0,input.length()-1);
        
}
    public static boolean isStringPalindrome(String input,int startIndex,int endIndex){
//       if(input.length()<=1){
//            return true;
//        }
       if(startIndex>=endIndex) {
    	   return true;
       }
        
      if(input.charAt(startIndex)==input.charAt(endIndex)){
        return isStringPalindrome(input,startIndex+1,endIndex-1);
         
          
        }
      else {
    	  return false;
      }
        
        
    }
    public static boolean isStringPAlindromeBetter(String str) {
    	if(str.length()<=1) {
    		return true;
    	}
    	if(str.charAt(0)==str.charAt(str.length()-1)) {
    		return isStringPAlindromeBetter(str.substring(1, str.length()-1));
    	}
    	else {
    		return false;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="";
    System.out.println(isStringPalindrome(str)); 
	}

}
