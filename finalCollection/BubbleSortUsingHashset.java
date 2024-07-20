package com.cglia.training.finalCollection;

import java.util.*;
import java.util.Iterator;
	
public class BubbleSortUsingHashset {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<>();
		hs.add(20);
		hs.add(10);
		hs.add(50);
		hs.add(30);
       List<Integer> al=new ArrayList<Integer>(hs);
       System.out.println(al);
		for(Integer i=0;i<al.size();i++)
		{
			for(Integer j=0;j<al.size()-1;j++)
			{
				if(al.get(j)>al.get(j+1)) {
				int temp=al.get(j+1);
					al.set(j+1,al.get(j));
					al.set(j, temp);
					
				}			
			}
		}
		Iterator<Integer> itr = al.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
				
}
}