package samplePrograms.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MAP {

	public static void main(String[] args) {

		String str = new String("Kalpesh Ahirrao");

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(101, "Jhon");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");

		System.out.println(m); // {101=Jhon, 102=David, 103=Scott, 104=Mary, 105=Tye}

		System.out.println(m.get(105));// Tye

		m.remove(103);
		System.out.println(m);// {101=Jhon, 102=David, 104=Mary, 105=Tye}

		System.out.println(m.containsKey(101));// true

		System.out.println(m.containsValue("Mary")); // true

		System.out.println(m.keySet()); // returns all the keys as set //[101, 102, 104, 105]

		System.out.println(m.entrySet());// returns all the entries as set // [101=Jhon, 102=David, 104=Mary, 105=Tye]

		System.out.println(m.values());// returns all the values as collection // [Jhon, David, Mary, Tye]

		for (Object i : m.keySet()) {

			System.out.println(i); // it will print all the key 
		}
		
		for(Object i : m.values()) {
		
			System.out.println(i); // it will print all the values
		}
		System.out.println("---------------------------------------- ");
		for(Object i : m.keySet()) {
			
			System.out.println(i+ " " +m.get(i));
		}
		
		System.out.println("---------------------------------------- ");
		for(Map.Entry entry:m.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
