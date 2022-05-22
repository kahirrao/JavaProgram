package samplePrograms;

import java.util.Scanner;

public class SmalllargeNumber {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value on n :");
		n= sc.nextInt();
		
		int numArray[]= new int[n];
		System.out.print("Enter array elements :");
		for (int i=0; i <n; i++) {
			numArray[i]= sc.nextInt();
		}
		
		int smallNo = numArray[0];
		int largeNo = numArray[0];
		
		for(int i =1; i < numArray.length; i++) {
			if(numArray[i] > largeNo)
				largeNo=numArray[i];
			else if(numArray[i] < smallNo)
				smallNo=numArray[i];
		}
		System.out.println("Large NO : " + largeNo);
		System.out.println("Small No : " + smallNo);
	}

}
