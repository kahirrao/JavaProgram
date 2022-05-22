package samplePrograms;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String [] args) {
		
		int n;
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter no value:");
		n= s.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Number is Even number");
		}
		else {
			System.out.println("Number " + n+ " is Odd Number:");
		}
	}
}


