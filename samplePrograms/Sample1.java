package samplePrograms;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
	
		String str = "kalpesh ahirrao";
		int len = str.length();
		
		char y[]= str.toCharArray();
		
		String rem= " ";
		
		char key = 'a';
		
		for(int i=0; i<len; i++)
		{
			if(y[i] != key)
			{
				rem= rem + str.charAt(i);
			}
		
		 }
		
		System.out.println(rem);
	}

}
