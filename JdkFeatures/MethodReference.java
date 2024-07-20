package com.cglia.training.JdkFeatures;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void eat(String s) {
		System.out.println("Eating Rasagola.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> name = Arrays.asList("Yudhistir","Arjun","Bheem","Nakul","Sahadev");
    // name.forEach(n->eat(n));
     name.forEach(MethodReference::eat);
	}

}
