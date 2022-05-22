package samplePrograms.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Set data= new HashSet<>();
		
		Set<String> data1= new HashSet<String>();
		
		data.add(31);
		data.add(22);
		
		data1.add("Klapesh");
		
		System.out.println("Set Data :" +data);
		System.out.println("Data Size :" +data.size());
		System.out.println("Data Size :" +data.iterator());
		System.out.println("\n------------------------------");
		System.out.println("Set Data :" +data1);
	}

}
