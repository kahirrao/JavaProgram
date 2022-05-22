package samplePrograms.Array;

import java.util.Scanner;

public class ArraySL {

		public static void main(String[] args) 
		{
			int array[] = new int[]{1,2,5,56,12,23,6,8,0};
			
			int smallNo = array[0];
			int largeNo = array[0];
			
			for (int i=1 ; i< array.length ; i++)
			{
				if (array[i] > largeNo )
					largeNo= array[i];
				else if (array[i] < smallNo )
					smallNo= array[i];
			}
			System.out.println("Large No is : " + largeNo );
			System.out.println("Small No is : " + smallNo );
		}

	}