package samplePrograms;
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
		int n;
		int sum=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Eneter value of Number:");
		n= s.nextInt();
		
		while(n !=0)
		{
			int lastdigit= n % 10;
			sum = sum + lastdigit;
			n = n/10;
		}
		
		System.out.println("Sum of Digits: " + sum);
	}
}
