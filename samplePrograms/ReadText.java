package samplePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) {

		String fileName = "C:\\Kalpesh\\Read.txt";
		
		try {
			FileReader fw= new FileReader(fileName);
			BufferedReader br = new BufferedReader(fw);
			String st;
			while ((st = br.readLine()) != null)

				System.out.println(st);

			br.close();
		} catch (FileNotFoundException ep) {

		} catch (IOException ex) {

		}

	}
}
