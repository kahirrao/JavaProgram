package samplePrograms.String;

public class StrRemCharaoccurance {

	public static void main(String[] args) {
		
		String str1 = "kalpesh ahirrao";
		String str = str1.replace(" ", "");
		char y[]= str.toCharArray();//k a l p e s h a h i r  r  a  o
		int size = str.length();    //0 1 2 3 4 5 6 7 8 9 10 11 11 12
		char key = 'a';

		
		String rem=" ";
		for (int i=0; i< size;i++)
		{
			if(y[i] !=key)
			{
				rem = rem + y[i];
			}
			
		}
		System.out.println(rem);
	}

}
