package com.learning.generics;

public class Pair<T,S> {
	private T first;
	private S second;
	private T third;
	
	public Pair() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pair(T first, S second, T third) {
		super();
		this.first = first;
		this.second = second;
		this.third=third;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getThird() {
		return third;
	}
	public void setThird(T third) {
		this.third=third;
	}
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second = second;
	}
	
	

}
