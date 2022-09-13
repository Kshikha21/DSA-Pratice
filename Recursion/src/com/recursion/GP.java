package com.recursion;

public class GP {

	public static double findGeometricSum(int k){
		// Write your code here
		
      if(k==0){
          return 1;
      }

     
      double output=findGeometricSum(k - 1) + 1 / Math.pow(2, k);
      
      return output;
	}
       

      
	

	public static void main(String[] args) {
		System.out.println(findGeometricSum(3));
	}

}
