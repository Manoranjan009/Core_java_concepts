package com.cglia.training.oops;

public class MethodOverloading {
	
public static void compute(int a,int b)
{
	System.out.println(a+b);
}
public static void compute(double a,double b)
{
	System.out.println(a*b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       compute(4,5);
       compute(2.4,7.0);
	}

}
