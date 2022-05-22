package samplePrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {

		String file = "C:\\Kalpesh\\Read.txt";

		try {
			FileWriter fw = new FileWriter(file);

			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("Amit");
			bw.newLine();
			bw.write("Karan");
			bw.close();
		}

		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
