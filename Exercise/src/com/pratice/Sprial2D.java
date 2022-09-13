package com.pratice;

public class Sprial2D {
	public static void spiralMethod(int arr[][],int n) {
		int dir=0;
		int top=0;
		int down=n-1;
		int left=0;
		int right=n-1;
		while(top<=down && left<=right) {
			if(dir==0) {
				for(int i=left ;i<=right;i++) {
					System.out.print(arr[top][i]+" ");
				}
				top=top+1;
			}else if(dir==1) {
				for(int i=top;i<=down;i++) {
					System.out.print(arr[i][right]+" ");
				}
				right=right-1;
			}else if(dir==2) {
				for(int i=right;i>=left;i--) {
					System.out.print(arr[down][i]+" ");
				}
				down=down-1;
			}else if(dir==3) {
				for(int i=down;i>=top;i--) {
					System.out.print(arr[i][left]+" ");
				}
				left=left+1;
				
			}
			dir=(dir+1)%4;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int n=4;
		spiralMethod(arr,n);
	}

}
