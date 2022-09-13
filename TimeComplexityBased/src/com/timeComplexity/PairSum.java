package com.timeComplexity;

import java.util.Arrays;

public class PairSum {
	public static int pairSum(int[] arr, int num) {
        int count=0;
        int sum=0;
		Arrays.sort(arr);
		
        int i=0;
        int j=arr.length-1;
        while(i<=j){
        	sum =arr[i]+arr[j];
            if(sum==num){
                i++;
                j--;
                System.out.println(sum);
                count++;
            }else if(sum<num){
            	System.out.println(sum);
                i++;
            }else{
            	System.out.println(sum);
                j--;
            }
        }
        return count;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,3,6,2,5,4,3,2,4};
		System.out.println(pairSum(arr,7));
	}

}
