package com.cglia.training.oops;

class Rose{
	public void colour() {
		System.out.println("Its colour is red .");
	}
	public void smell() {
		System.out.println("Smells Good .");
	}
}
class Champa extends Rose{
	public void colour() {
		System.out.println("Its colour is white .");
	}
//	public void smell() {
//		System.out.println("Smells very Good .");
//	}
	public void fresh() {
		System.out.println("not fresh .");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Rose r =new Champa();
         r.colour();
         r.smell();
	}

}
