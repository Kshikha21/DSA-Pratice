package com.pratice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PraticeArrayList {
	
	
	
	public static List  checkIfstartswithA(List <String> listString) {
		listString.removeIf(element->(element.startsWith("a")));
		
		listString.stream().map(element->(element.startsWith("a")));
		
		
//		for(String a:listString) {
//			if(!listString.contains("a")) {
//				listString.remove(a);
//			}
//		}
//		
		
		
		return listString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("antique");
		list.add("zepti");
		list.add("animal");
		list.add("hello");
		list.add("etc");
			System.out.println(checkIfstartswithA(list));
		
		
	}

}
