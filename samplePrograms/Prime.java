package samplePrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int num;
		Scanner s= new Scanner(System.in);
		System.out.print("Eneter a number till you want to search Prime Number : ");
		num= s.nextInt();

		for (int i = 1; i <= num; i++) {
			int count=0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(i);
				
			}
			
		}
	
	}
}
