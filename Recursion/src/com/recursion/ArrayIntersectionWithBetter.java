package com.recursion;

public class ArrayIntersectionWithBetter {
	private static void arrayIntersect(int[] a1, int[] a2) {
		//mlogn +nlogn 
		if(a1.length>a2.length) {
			ArrayIntersection.MergeSort(a2);
			for(int i=0;i<a1.length;i++) {
				int intersec=binarySearch(a2,a1[i]);
				System.out.println(intersec);
			}
		}else {
			ArrayIntersection.MergeSort(a1);
		}
		
	}
	
	private static int binarySearch(int[] a2, int i) {
		
		return BinarySearch( a2, 0, a2.length-1, i);
	}

	public static int BinarySearch(int a[],int si,int end,int x) {
		if(si>end) {
			return 0;
		}
		int midIndex=(si+end)/2;
		if(a[midIndex]==x) {
			return a[midIndex];
		}else if(a[midIndex]<x) {
			return BinarySearch(a,midIndex+1, end, x);
		}else {
			return BinarySearch(a,si, midIndex-1, x);
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a1[]= {12,3,7,4,6,1,0};
		   int a2[]= {6,13,4,2,8,34};
		   arrayIntersect(a1,a2);
	}

	

}
