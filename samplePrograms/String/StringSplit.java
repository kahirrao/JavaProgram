package samplePrograms.String;

import java.lang.String;
public class StringSplit {
	
	public static void main(String [] args) {
		
		String str = new String("Kalpesh Ahirrao");
				
		 System.out.println("split(String regex):"); 
		String array[] = str.split(" ");
		for(String temp: array) {
			System.out.println(temp);
		}
	}

}
