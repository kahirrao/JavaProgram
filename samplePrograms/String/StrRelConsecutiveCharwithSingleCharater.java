package samplePrograms.String;

public class StrRelConsecutiveCharwithSingleCharater {

	public static void main(String[] args) {

		String str = "kalllpppeeesshh";
				
		String newString = "";
		char prevChar = ' ';
		
		for(int i=0; i< str.length();i++)
		{
			if(prevChar != str.charAt(i))
			{
				newString = newString + str.charAt(i);
				prevChar = str.charAt(i);
			}
		}
		System.out.println(newString);
	}

}
