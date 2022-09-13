package com.recursion;

public class Factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		
		return n*fact(n-1);
	}
	public static int sumOfN(int n) {
		if(n==0) {
			return 0;
		}
		return sumOfN(n-1)+n;
	}
	public static void print1ToN(int n) { // 1 2 3 4..N-1.N
		if(n==0) {
			return;
		}
		print1ToN(n-1);
		System.out.println(n); //N is printed after N-1 
	}
	public static int fib(int n) {
		if((n==1) || (n==2)) {
			return 1;
		}
		if(n==0) {
			return -1;
		}
		int fib_n_1=fib(n-1);
		int fib_n_2=fib(n-2);
		int output=fib_n_1+fib_n_2;
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//   System.out.println(sumOfN(4));
//   print1ToN(5);
   System.out.println(fib(0));
	}
	

}
