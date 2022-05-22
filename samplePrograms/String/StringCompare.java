package samplePrograms.String;

import java.util.Scanner;
import java.lang.String;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String s1, s2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value string s1 :");
		s1= sc.nextLine();
		
		System.out.println("Enter value string s2 :");
		s2= sc.nextLine();
		
		boolean b = (s1.equals(s2));
		
		if(b== true) {
			System.out.println("Both string are Equal");
		}
		else
		{
			System.out.println("Both string are not equal");
		}
	}

}
