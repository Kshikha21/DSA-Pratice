package com.recursion;

public class ArrayIntersection {  //mlogm + nlogn
	public static void arrayIntersect(int a1[],int a2[]) {
		MergeSort(a1);  //mlogm
		MergeSort(a2);  //nlogn
		int i=0,j=0;
		while(i<a1.length && j<a2.length) { //might m+n 
			if(a1[i]>a2[j]) {
				j++;
			}else if(a1[i]<a2[j]) {
				i++;
			}else {
				System.out.println(a1[i]);
				i++;
				j++;
			}	}
		
	}

	public  static void MergeSort(int[] a1) {
		if(a1.length<=1) {
			return;
		}
		int b[]=new int[a1.length/2];
		int c[]=new int[a1.length-b.length];
		for(int i=0;i<a1.length/2;i++) {
			b[i]=a1[i];
		}
		for(int i=a1.length/2;i<a1.length;i++ ) {
			c[i-a1.length/2]=a1[i];
		}
		MergeSort(b);
		MergeSort(c);
		merge(b,c,a1);

		
		
	}

	public static void merge(int[] b, int[] c, int[] a1) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		while(i<b.length && j<c.length) {
			if(b[i]<=c[j]) {
				a1[k]=b[i];
				i++;
				k++;
			}else {
				a1[k]=c[j];
				j++;
				k++;
			}
		}
		while(i<b.length) {
			a1[k]=b[i];
			i++;
			k++;
			
		}while(j<c.length) {
			a1[k]=c[j];
			j++;
			k++;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a1[]= {12,3,7,4,6,1,0};
   int a2[]= {6,13,4,2,8,34};
   arrayIntersect(a1,a2);
	}

}
