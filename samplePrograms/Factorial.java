package samplePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String [] args) {
		
		int n, fact=1;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter value of n : " );
		n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			fact= fact*i;
		}
		System.out.println("Factoril of Number: " + fact);
	}
}
