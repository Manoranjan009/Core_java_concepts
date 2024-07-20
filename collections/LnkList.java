package com.cglia.training.collections;

import java.util.*;

public class LnkList {

	public static void main(String[] args) {
		
		LinkedList<String> lnk= new LinkedList<String>();
		lnk.add("Banty");
		lnk.add("Vishal");
		
		lnk.addFirst("Gudu");
		System.out.println(lnk);
		
		
		System.out.println(lnk);
		
		lnk.addLast("Bapi");
		System.out.println(lnk);
		
	    Iterator<String> itr = lnk.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
