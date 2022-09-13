package com.recursion;

public class LastIndex {
	
	public static int lastIndex(int input[],int x) {
		   return lastIndex(input,x,0);
	}

	private static int lastIndex(int[] input, int x, int index) {
		// TODO Auto-generated method stub
		  if(index==input.length) {
			  return -1;
		  }
		  System.out.print("for index"+index);
		  
		  System.out.println("sequence of call and values of smallAns being returned from bottom");
		  int smallAns=lastIndex(input,x,index+1);
		  System.out.println(smallAns+"for index"+index);
		  if(smallAns!=-1) {
			  return smallAns;
		  }
		  else {
		  if(input[index]==x) {
			  return index;
		  }else {
			  return -1;
		  }
	}}
	public static void func(int n)
	{
	    int sum=0;
	    for(int i=1;i<n;i*=2)
	        {
	    	System.out.println("inside first foor loop"+i);
	                sum+=i;  
	        }
	    System.out.println(sum);
	}
	
	public static int lastIndexMethod(int arr[],int x,int start) {
		if(start==arr.length) { ///length=0;
			return -1;
		}
		int smallans=lastIndexMethod(arr,x,start+1);
		if(smallans!=-1) {
			return smallans;
		}else if(arr[start]==x) {
			return start;
		}
		else {
			return -1;
		}
		
		
		
	}
	
//	public static void func(int n)
//	{
//	    int sum=0;
//	    for(int i=1;i<n;i++)
//	        {
//	    	System.out.println("inside first foor loop"+i);
//	            for(;i<n*n;i++)
//	            {
//	            	System.out.println("inside second foor loop"+i);
//	                sum+=i;
//	            }
//	        }
//	    System.out.println(sum);
//	}

	public static void main(String[] args) {
	
		int arr[]= {2,4,5,6,2,3,9,10};
	//int result=	lastIndex(arr,2);
   System.out.println(lastIndex(arr,2)); 
		//func(10);
	}

}
