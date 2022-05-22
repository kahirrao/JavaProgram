package samplePrograms;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		int n,i;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter value of n : ");
		n = s.nextInt();
		for(i=n; i>n;i--) {
			for(int j=0; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}


