package com.cglia.training.JdkFeatures;

public class SwitchExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String day = "Sunday";
		String time =" ";
		
		time = switch(day) {
		case "Sunday","Saturday"-> "wake up at 10 AM ";
		//case "Sunday","Saturday" :yield "wake up at 10 AM ";
		case "Monday"->"wake up at 8 AM .";
		//case "Monday":yield"wake up at 8 AM .";           // also we can write this way
		default ->"wake up at 7 AM";
		};
		System.out.println(time);
	}

}
