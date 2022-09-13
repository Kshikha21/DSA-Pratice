package com.recursion;

public class ConversionToInt {
	public static int convertStringToInt(String input){
		// Write your code here
        if(input.length()==1){
            return input.charAt(0)-48;
        }
        int cal=(int)Math.pow(10, input.length()-1);
       // System.out.println(input.length()+" "+cal);
        
        int firstDigitAns=(input.charAt(0)-48)*cal;
     //   System.out.print(input.charAt(0)+" " +firstDigitAns);
        int smallerAns=convertStringToInt(input.substring(1));
        
        return firstDigitAns+smallerAns;
        
        
//       int len=input.length();
//       if(input.charAt(0)!=0) {
//    	int value=(int)Math.pow(10, len-1);
//      	 int afterMul=(input.charAt(0)-48)*value;
//      	 return afterMul+convertStringToInt(input.substring(1));
//     }
//      else {
//      	return convertStringToInt(input.substring(1));
//      }
//        
//     
        
	}
	public static int ConvertStringToInt(String input) {
		if(input.length()==1) {
			return input.charAt(0)-'0';
			
		}
		int smaller=ConvertStringToInt(input.substring(0, input.length()-1));
		int lastElementOutput=input.charAt(input.length()-1)-48;
		return smaller*10+lastElementOutput;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(convertStringToInt("1231"));
System.out.println(ConvertStringToInt("1231"));
	}

}
