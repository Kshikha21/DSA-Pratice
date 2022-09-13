package com.recursion;

public class BinarySearchWithRecursion {
	
	public static int BinarySearch(int a[],int si,int end,int x) {
		if(si>end) {
			return -1;
		}
		int midIndex=(si+end)/2;
		if(a[midIndex]==x) {
			return midIndex;
		}else if(a[midIndex]<x) {
			return BinarySearch(a,midIndex+1, end, x);
		}else {
			return BinarySearch(a,si, midIndex-1, x);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,7,9,13,45};
     System.out.println(BinarySearch( a, 0, a.length-1, 7));
	}

}
