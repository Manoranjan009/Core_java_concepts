package com.cglia.training.exception;

import java.util.Scanner;
@SuppressWarnings("serial")
class TestException extends Exception{
	String t;
	 TestException(String t) {
		 this.t = t;
		System.out.println(t);
	}
	 @Override
	 public String toString() {
		 return "TestException arise here: "+t;
	 }
}
class CustomiseException{
	public static void test(int mark) throws TestException{
		if(mark<30) {
			throw new TestException("The student failed in exam.");
		}
		else {
			System.out.println("The student passed in exam .");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mark of the student : ");
		int mark=sc.nextInt();
		try {
			test(mark);
		}
		catch(Exception e) {
			System.out.println("He should study hard .");
			System.out.println(e);
		}
		sc.close();
	}
}























