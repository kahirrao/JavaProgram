package samplePrograms;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		int num, num2;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of n : ");
		num = s.nextInt();
		System.out.println("Numbers between 1 to 30 are: ");
		for(int i=1; i<=num; i++){
			System.out.print(i + " ");
	}
		System.out.println("\nEnter value of Number : ");
		num2 = s.nextInt();
		int j;
		for(j=1;j<num;j++)
		{
			if(num % j == 0)
			{
				System.out.println("Not Prime");
				break;
			}
		}	
		if(num == j)
		{
			System.out.println("Prime");
			}
		}

}
