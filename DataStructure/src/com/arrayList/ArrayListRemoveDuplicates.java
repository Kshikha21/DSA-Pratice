package com.arrayList;

import java.util.ArrayList;

public class ArrayListRemoveDuplicates {
	
	public static ArrayList<Integer> removeConsectiveDuplicates(int [] arr){
		ArrayList<Integer> list=new ArrayList<>();
		int i=0;
		for(;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
			
			
			
			}else {
				list.add(arr[i]);
				
			}
		}
		if(i==arr.length-1) {
			list.add(arr[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {10,10,20,20,20,30,40,10};
     System.out.println(removeConsectiveDuplicates(arr));
	}

}
