package com.cglia.training.oops;

abstract class Fruits{
	abstract void taste();
	}

class apple extends Fruits{
	void taste() {
		System.out.println("The test of Apple is sweet .");
	}
}
 public class abstraction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Fruits f= new apple();
   f.taste();
	}

}
