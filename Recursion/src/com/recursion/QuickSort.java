package com.recursion;

public class QuickSort {
	public static void QuickSortMethod(int a[],int start,int end) {
		if(start>=end) {
			return;
		}
		int pivotIndex=partition(a,start,end);
		QuickSortMethod(a,start,pivotIndex-1);
		QuickSortMethod(a,pivotIndex+1,end);
		
	}
	private static int partition(int[] a,int start,int end) {
		int p=a[start];
		int i=start;
		int j=end;
		while(i<j) {
		 if(a[i]<p) {
			 i++;
		 }else {
			 if(a[j]>=p) {
				 j--;
			 }else {
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 i++;
				 j++;
			 }
		 }
			
		}
		
		
	
		return p;
	}
	public static void main(String[] args) {
	int []a= {10,2,8,1,6,2};
	QuickSortMethod(a, 0, a.length-1);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
		
	}

}
