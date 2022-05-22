package samplePrograms.String;

import java.net.InetAddress;

import java.net.UnknownHostException;
import java.util.Scanner;
import java.lang.String;

public class StringConversion {

	public static void main(String[] args) {

		
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string value :");
		s1= sc.nextLine();
		
		String lower = s1.toLowerCase();
		System.out.println("String in Lower case : " +lower);
		
		String upper = s1.toUpperCase();
		System.out.println("String in Upper case : " +upper);
		
		//Program to calculate substring
		String s2= s1.substring(0,5);
		System.out.println("Substring is : " +s2);

		//program to get ip Address
		try {
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
