package com.cglia.training.oops;


public class PassbyValue {
	 public static void swap(int a, int b) {
		 int temp;
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("After swap a= "+a+" b= "+b);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(4,5);

	}

}
