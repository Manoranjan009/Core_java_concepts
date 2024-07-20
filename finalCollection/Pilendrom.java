package com.cglia.training.finalCollection;

import java.util.Scanner;
//import java.util.*;

@FunctionalInterface
interface PalindromeChecker{
	boolean checkPalindrome(int number);
}

public class Pilendrom {

	public static void main(String[] args) {
		//List<Integer> li=new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		
		 PalindromeChecker palindromeChecker = (number)->{
			 int temp = number,sum = 0;
			 while(number>0) {
			 int digit=number%10;
			 sum=sum*10+digit;
			 number=number/10;
			}
		return sum == temp ;
		};
		
		int number=sc.nextInt();
		 System.out.println( palindromeChecker. checkPalindrome(number)?("This is a palindrome number"):("This is not a palindrome number"));
	       sc.close();
	       }
		

	}


