package com.recursion;

public class ReplaceStringwithNumber {
	public static String replacePi(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i') {
			return "3.14"+ replacePi(s.substring(2));
		}else {
			return s.charAt(0)+replacePi(s.substring(1));
		}
	}
	/*
	 * public static String replacePiAnotherWay(String s) { if(s.length()<=1) {
	 * return s; } String smallString=replacePiAnotherWay(s.substring(1));
	 * if(s.charAt(0)=='p' && s.charAt(1)=='i') {
	 * 
	 * return "3.14"+smallString; } else { return s.charAt(0)+smallString; }
	 * 
	 * 
	 * }
	 */

	public static void main(String[] args) {
		System.out.println(replacePi("sdhpisdnp"));
		
		//System.out.println(replacePiAnotherWay("ppisdnsis"));

	}

}
