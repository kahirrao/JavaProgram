package samplePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadText1 {

	public static void main(String[] args) throws IOException {
		
		
			FileInputStream fis = new FileInputStream("C:\\Kalpesh\\Read.txt");
			Scanner sc = new Scanner(fis);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		
			fis.close();
		

	}

}
