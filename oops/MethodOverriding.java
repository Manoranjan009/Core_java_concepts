
package com.cglia.training.oops;


class Fruit {
	public void test() {
		System.out.println("The test of the friut is sweet .");
	}
}

class Mango extends Fruit {
	@Override
	public void test() {
		System.out.println("The test of the Mango is sour .");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit mo = new Mango();
		Fruit md = new Fruit();
		mo.test();
		md.test();
	}

}
