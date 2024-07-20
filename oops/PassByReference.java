package com.cglia.training.oops;


public class PassByReference {
	int x,y;
	public static void swap(PassByReference P1) {
		int temp;
		temp= P1.x;
		P1.x=P1.y;
		P1.y=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByReference P= new PassByReference();
		P.x=7;
		P.y=8;
	System.out.println("Before swap x= "+P.x+" y= "+P.y);	
      swap(P);
     System.out.println("After swap x= "+P.x+" y= "+P.y);
	}

}
