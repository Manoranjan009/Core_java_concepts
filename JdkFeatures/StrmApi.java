package com.cglia.training.JdkFeatures;

import java.util.Arrays;
import java.util.List;


public class StrmApi {

	public static void main(String[] args) {
		
		List<Integer> ar = Arrays.asList(6,1,5,4,7);

		//        Stream<Integer> data = ar.stream().map(n->n*2); // using lambda expression
		//        data.forEach(n-> System.out.println(n));

                //Stream<Integer> sortedData = data.sorted();
		//sortedData.forEach(n-> System.out.println(n));

		//Stream<Integer> mapedData = data.map(n->n*2);
		//mapedData.forEach(n-> System.out.println(n));

		ar.stream()                                 //here as using many stream after completion of one stream it 
		.filter(n-> n%2==0)                        // it get replaced by another stream
	        .sorted()                             
		.map(n->n*2)
		.forEach(n-> System.out.println(n));       // using lambda expression to do in one line. 

		
	}
}
