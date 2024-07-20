package com.cglia.training.collections;

import java.util.*;
public class SetCollection {

	/**   **/
	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(75); 
        hs.add(13); 
        hs.add(26);
        hs.add(43);
        hs.add(75);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        
//        for(int n :hs) {
//        	System.out.println("using hash set :"+n);
//        }
//        
        Set<Integer> ts =new TreeSet<Integer>();
		ts.add(25); 
        ts.add(23); 
        ts.add(26);
        ts.add(43);
        ts.add(25);
        //ts.add(null);
        ts.add(-46);
        System.out.println(ts);
        
//        for(int n :ts) {
//        	System.out.println("using tree set :"+n);
//        }
	}
}
