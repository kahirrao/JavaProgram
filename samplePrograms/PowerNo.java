package samplePrograms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class PowerNo {

	public static void main(String[] args) throws Exception {

		System.out.println("IP Address of System is : " + InetAddress.getLocalHost());

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		n = sc.nextInt();

		System.out.println("Square of no is : " + Math.pow(n, 2));

		System.out.println("Cube of no is : " + Math.pow(n, 3));
	}

}
