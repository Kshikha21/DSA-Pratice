package com.recursion;

public class QuickSortBetter {
	public static void QuickSortMethod(int a[],int start,int end) {
		if(start>=end) {
			return;
		}
		int pivotIndex=partition(a,start,end);  ///ntime  
		QuickSortMethod(a,start,pivotIndex-1);
		QuickSortMethod(a,pivotIndex+1,end);
		
	}

	private static int partition(int[] a,int start,int end) {
		int pivotElement=a[start];
		int smallerNumCount=0;
		for(int i=start+1;i<=end;i++) {
			if(a[i]<pivotElement) {
				smallerNumCount++;
			}
		}
		int temp=a[start+smallerNumCount];
		a[start+smallerNumCount]=pivotElement;
		a[start]=temp;
		
		int i=start;
		int j=end;
		while(i<j) {
			if(a[i]<pivotElement) {
				i++;
			}else if(a[j]>=pivotElement) {
				j--;
			}
			else {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
				
			}
		}
		
		
		
		return start+smallerNumCount ;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {4,2,6,1,9,3};
   QuickSortMethod(a, 0, a.length-1);
  for(int i=0;i<a.length;i++) {
	  System.out.println(a[i]);
  }
	}

}
