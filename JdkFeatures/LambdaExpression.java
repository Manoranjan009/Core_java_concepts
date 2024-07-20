package com.cglia.training.JdkFeatures;


interface animal{
	void eat(int a);
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      animal aml=(a)->{ System.out.println("Lions eat wild animals meat ." + a);
	};
   aml.eat(10);
}
}
