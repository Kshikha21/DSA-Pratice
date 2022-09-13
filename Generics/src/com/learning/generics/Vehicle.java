package com.learning.generics;

public class Vehicle implements PrintInterface {
	int tyre;
	int maxSpeed;
	
	Vehicle(){
		
	}
	Vehicle(int tyre,int maxSpeed){
		this.tyre=tyre;
		this.maxSpeed=maxSpeed;
	}
	public void print() {
		System.out.println(tyre+" "+maxSpeed);
	}
	public int getTyre() {
		return tyre;
	}
	public void setTyre(int tyre) {
		this.tyre = tyre;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
