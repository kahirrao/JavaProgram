package samplePrograms;

import java.util.Scanner;

public class NumberTringle1 {
	public static void main(String[] args) {	
				int n,sum=1;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter value of n : ");
				n = s.nextInt();
				
				for(int i=n; i>=1; i--)
				{
					for (int j=1; j<=i; j++)
					{
						System.out.print(j+ " ");
					}
					System.out.println();
				}		
			}
		

	}

//num; num=1; num++
//1 2 3 4
//6 7 8 
//9 10