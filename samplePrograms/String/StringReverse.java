package samplePrograms.String;

import java.util.Scanner;
import java.lang.String;

public class StringReverse {

	public static void main(String[] args) {

		String s1, reverse =" ";
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a String Value : ");
		s1 = s.nextLine();
		
		int length = s1.length();
		
		for(int i=length -1 ; i >=0 ; i--) {
			reverse = reverse + s1.charAt(i);
		}
		System.out.println("Reverse : " +reverse);
	}

}
