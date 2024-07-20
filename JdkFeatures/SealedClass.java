package com.cglia.training.JdkFeatures;

sealed class A permits B,C{
	public void read() {
		System.out.println("Ram read the book.");
	}
}
non-sealed class B extends A{    }
final class C extends A{
	
}
//class D extends A{    }                  //It shows compilation error as it is not permitted. 

public class SealedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B b = new B();
         b.read();
         //D d= new D();
         //d.read();
         System.out.println(b);         // This will run properly as it is permitted.
         //System.out.println(d);
	}

}
