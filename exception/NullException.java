package com.cglia.training.exception;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		try {
			System.out.println(name.length());
		}
        catch(NullPointerException n) {
        	System.out.println(n);
        }
	}

}
