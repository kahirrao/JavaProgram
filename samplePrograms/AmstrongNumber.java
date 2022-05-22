package samplePrograms;

import java.util.Scanner;

class Armstrong {
	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N:");
		num = sc.nextInt();

		int a = num;
		int arm = 0;
		int reminder;

		while (num > 0) {
			reminder = num % 10;
			arm = arm + (int) Math.pow(reminder, 3);
			num = num / 10;
		}
		if (arm == a) {
			System.out.print(a + " is Armstrong Numbber");
		} else {
			System.out.print(a + " is Armstrong Numbber");
		}
	}

}