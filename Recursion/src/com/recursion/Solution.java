package com.recursion;

public class Solution {
	public static void mergeSort(int[] input){
		// Write your code here
        if(input.length<=1){
            return;
        }
        int[] arr1=new int[input.length/2];
        int[] arr2=new int[input.length-arr1.length];
        
        for(int i=0;i<input.length/2;i++){
            arr1[i]=input[i];
        }
        for(int i=input.length/2;i<input.length;i++){
            arr2[i-input.length/2]=input[i];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1,arr2,input);
        
		
	}
    public static void merge(int[] a1,int[] a2,int[] input){
        int i=0;
        int j=0;
        int k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<=a2[j]){
                input[k]=a1[i];
                i++;
                k++;
            }else{
                 input[k]=a2[j];
                j++;
                k++;
            }
        }
        while(i<a1.length){
            input[k]=a1[i];
                 i++;
                k++;
        }
        while(j<a2.length){
             input[k]=a2[j];
                j++;
                k++;
        }

}}
