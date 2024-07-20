package com.cglia.training.collections;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		
		Map<String,Integer> student=new HashMap<>();
		
		student.put("Manoj", 80);
		student.put("Rahul", 85);
		student.put("Dibya", 70);
		student.put("Dhara", 75);
		student.put("Manoj", 90);
		student.put(null, null);            // hashmap can accommodate only one null key and multiple null values. 
		//student.put(null, null);
		
		
		
		System.out.println(student.keySet());
		
		for(String key : student.keySet()) {
			System.out.println(key +" = " +student.get(key));
		}
		
		Map<String,Integer> god=new TreeMap<>();
		god.put("Ram", 80);
		god.put("Laxman", 85);
		god.put("Barat", 70);
		god.put("Satrugnha", 75);
		god.put("Ram", 90);
		god.put("Hari", null);            //it can accommodate null values not null key
		//god.put(null,30);                 //key must have some value.
		
System.out.println(god.keySet());
		
		for(String key : god.keySet()) {
			System.out.println(key +" = " +god.get(key));
		}
		
		
	}

}
