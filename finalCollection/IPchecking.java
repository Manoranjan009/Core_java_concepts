package com.cglia.training.finalCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class IPchecking {
	public static boolean isVaidateIp(String ip) {
		String[] ipValid = ip.split("\\.");
		if(ipValid.length != 4) {
			return false;
		}
		for(String num : ipValid) {
			Integer n = Integer.parseInt(num);
			if(n<0 || n>255) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		List<String> ipAddress = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the IP address : ");
		//String ipAdd = ipAddress.stream().map(Object::toString).collect(Collectors.joining());
		String ipAdd = String.join("",ipAddress);
		 ipAdd=sc.next();
		
		 System.out.println(isVaidateIp(ipAdd)?(ipAdd+" IP address is valid."):(ipAdd+" IP address is invalid."));
		 sc.close();
		}
	}
