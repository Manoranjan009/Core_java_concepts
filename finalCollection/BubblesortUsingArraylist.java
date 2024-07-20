package com.cglia.training.finalCollection;

import java.util.*;

public class BubblesortUsingArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(7);
		ar.add(3);
		ar.add(10);
		ar.add(4);
       System.out.println(ar);
		for(Integer i=0;i<ar.size();i++)
		{
			for(Integer j=0;j<ar.size()-1;j++)
			{
				if(ar.get(j)>ar.get(j+1)) {
				int temp=ar.get(j+1);
					ar.set(j+1,ar.get(j));
					ar.set(j, temp);
					
				}			
			}
		}
		System.out.println(ar);
	}

}
