package com.learning.generics;

public class PairUse {
	

	public static void main(String[] args) {
		Pair<String,Integer> pInner=new Pair<>();
		Pair<Pair<String,Integer>,String> ppsI=new Pair<>();
		pInner.setFirst("hi");
		pInner.setSecond(2);
		ppsI.setFirst(pInner);
		ppsI.setSecond("hello");
		
		System.out.println(ppsI.getFirst().getFirst()+" "+ppsI.getFirst().getSecond()+" "+ppsI.getSecond());
		
//		Pair<String> ps=new Pair<>("hi","hey");
//		ps.setFirst("hello");
//		System.out.println(ps.getFirst()+" "+ps.getSecond());
//		
//		Pair<Integer> pi=new Pair<>();
//		pi.setFirst(1);
//		pi.setSecond(2);
//		System.out.println(pi.getFirst()+" "+pi.getSecond());
//		
//	
//		Pair<String,Integer> pSi=new Pair<>("hello",1);
//		System.out.println(pSi.getFirst()+" "+pSi.getSecond());
		
//		Pair<String,Integer> pp=new Pair<>("hello",1,"welcome");
//		System.out.println(pp.getFirst()+" "+pp.getSecond()+" "+pp.getThird());
	}

}
