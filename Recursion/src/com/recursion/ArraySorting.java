package com.recursion;

public class ArraySorting {
	public static boolean isSorted(int a[]) {
		if(a.length==1) {
			return true;
		}
		if(a[0]>a[1]) {
			return false;
		}
		int smallArray[]=new int[a.length-1];
		for(int i=1;i<a.length;i++) {
			smallArray[i-1]=a[i];
		}
		boolean isSmallArraySorted=isSorted(smallArray);
		return isSmallArraySorted;
				
				
				
	
		
	}
	public static boolean issorted(int arr[],int si) {
		if(si==arr.length-1) {
			return true;
		}
		if(arr[si]>arr[si+1]){
			return false;
		}
		boolean isSmallArraySorted=issorted(arr,si+1);
		return isSmallArraySorted;
	}
	
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int len=input.length;
		if(len==0){
            return 0;
        }
		int [] newArray=new int[len-1];
		for(int i=0;i<newArray.length;i++) {
			newArray[i]=input[i];
		}
		int sumOfnewArray=sum(newArray);
		return sumOfnewArray+input[len-1];
		
		
	}
	
	
	////////**********************new way to find sum of array***************/////////////////
 public static int sumOf(int input[]) {
	 return sum(0,input);
 }

	private static int sum(int index, int[] input) {
	if(index==input.length) {
		return 0;
	}
	
	return input[index]+sum(index+1,input);
}
	
	/////////////////////*************************////////////////////////////////////////////

	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return checkNumber(input,x,0);
	}
    public static boolean checkNumber(int input[],int x, int startIndex){
        if(startIndex==input.length){
            return false;
        }
        if(input[startIndex]==x){
            return true;
        }
        return checkNumber(input,x,startIndex+1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,2,3,4,5};
   int output =sum(arr);
   System.out.println(output);
	}

}
