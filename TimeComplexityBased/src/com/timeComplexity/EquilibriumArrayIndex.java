package com.timeComplexity;

public class EquilibriumArrayIndex {
	public static int equilibriumIndex( int[] arr) {
	int totalSum=0;
	int rightSum=0;
	int index=0;int i=0;
	while(i<arr.length) {
		totalSum=totalSum+arr[i];
		i++;
	}
	int leftSum=0;
	while(index<arr.length) {
		rightSum=totalSum-leftSum-arr[index];
		if(rightSum==leftSum){
			return index;
		}
			leftSum=leftSum+arr[index];
			index=index+1;
		
	}
	
	return -1;
	
	
	}


	public static void main(String[] args) {
		int arr[]= {2,3,1,5};
		System.out.println(equilibriumIndex(arr));
	}

}
