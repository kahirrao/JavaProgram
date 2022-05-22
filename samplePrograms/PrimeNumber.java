package samplePrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int no, i;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number :");
		no = s.nextInt();

		if (no == 1) {
			System.out.println("Not Prime");
		}

		for (i = 2; i < no; i++) {
			if (no % i == 0) {
				System.out.println(no + " is Not Prime Numbber");
				break;
			}
		}

		if (no == i) {
			System.out.println(no + " is Prime Number");
		}
	}
}