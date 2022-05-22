package samplePrograms;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		
		int n;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter value of n : " );
		n=s.nextInt();
		
		int f1,f2=0,f3=1;
		
		System.out.print(f2 + " ");
		for (int i=1 ; i<=n; i++)
		{
			System.out.print(f3+ " ");
			f1=f2;
			f2=f3;
			f3=f1+f2;;
		}

	}

}
