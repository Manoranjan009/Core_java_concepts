package com.cglia.training.oops;


class colours1{
    public void colour(){
        System.out.println("The car colour is Black");
    }
}    
class Audi extends colours{
	public void name() {
		System.out.println("The name of the car is Audi .");
	}
	
}
class BMW extends colours{
	public void name() {
		System.out.println("The name of the car is BMW ");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		Audi A= new Audi();
		A.name();
		A.colour();
		BMW B = new BMW();
		B.name();
		B.colour();	     
	}

}
