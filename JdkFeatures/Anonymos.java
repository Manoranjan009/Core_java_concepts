package com.cglia.training.JdkFeatures;

interface Fruit{
	 void taste();
	 void colour();
	}

public class Anonymos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f= new Fruit(){
			public void taste() {
				System.out.println("Sweet");
			}
			public void colour() {
				System.out.println("Red");
			}
		};
		f.taste();
	}

}
