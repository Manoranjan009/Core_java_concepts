package com.cglia.training.finalCollection;

import java.util.*;
import java.util.Iterator;

public class EvenOddSeparation {
		    public static void main(String[] args) {
		        List<Integer> al = new ArrayList<>();
		        List<Integer> evenList = new ArrayList<>();
		        List<Integer> oddList = new ArrayList<>();

     	        al.add(18);
		        al.add(122);
		        al.add(21);
		        al.add(12);
		        al.add(6);
		        al.add(15);
		        al.add(9);
		        al.add(100);

		        System.out.println("Before arrangeing :" + al);

		        Iterator<Integer> itr = al.iterator();
		        while (itr.hasNext()) {
		            int num = itr.next();
		            if ((num % 2) == 0) {
		                evenList.add(num);
		            } else {
		                oddList.add(num);
		            }

		        }
		        Collections.sort(evenList);
		        Collections.sort(oddList);

		        al.clear();
		        al.addAll(oddList);
		        al.addAll(evenList);

		        System.out.println("After arrangeing :"+al);
		    }

	}


