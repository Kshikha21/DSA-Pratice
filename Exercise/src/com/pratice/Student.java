package com.pratice;

public class Student {
	private int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 int a; 
     int b; 

 public void set(int a, int b) 
 {  
     b = a; 
     this.b = b; 
 } 

 void display() 
 { 
     System.out.println("a=" + a + " b=" + b); 
 } 

}
