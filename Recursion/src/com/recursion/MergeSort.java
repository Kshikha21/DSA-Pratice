package com.recursion;

public class MergeSort {
	public static void mergeSort(int a[]) {
		if(a.length<=1) {
			return;
		}
		int b[]=new int[a.length/2];
		int c[]=new int[a.length-b.length];
		for(int i=0;i<a.length/2;i++) {
			b[i]=a[i];
		}
		for(int i=a.length/2;i<a.length;i++) {
			c[i-a.length/2]=a[i];
		}
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);
	}

	private static void merge(int[] b, int[] c, int[] a) {                       
	int i=0;
	int j=0;
	int k=0;
	while(i<b.length && j<c.length) {
		if(b[i]<=c[j]) {
			a[k]=b[i];
			i++;
			k++;
		}else {
			a[k]=c[j];
			j++;
			k++;
		}
	}
	while(i<b.length) {
		a[k]=b[i];
		i++;
		k++;
		
	}while(j<c.length) {
		a[k]=c[j];
		j++;
		k++;
	}
		
	}

	public static void main(String[] args) {
		int a[]= {5,2,8,23,3,10,1,6};
	mergeSort(a);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}

	}

}
