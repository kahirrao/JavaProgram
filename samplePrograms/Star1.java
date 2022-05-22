package samplePrograms;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		n = s.nextInt();


		for (int i = 0; i <= n; i++) {

			for (int j = n; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = n-1; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
