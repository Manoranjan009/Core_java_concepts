package com.cglia.training.JdkFeatures;

@FunctionalInterface
interface student{
	void std1();
	String toString();              
	boolean equals(Object obj);
}
public class FncInterface implements student{
    	public void std1() {
		System.out.println("I am Manoj .");
		}
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FncInterface fn = new  FncInterface();
        fn.std1();     
        //  In case of functional interface we only have one abstract method to implement .Except methods implemented in object class it will show 
        //error.Again this notation @FunctionalInterface will give idea while modification of the code.
	}
}


