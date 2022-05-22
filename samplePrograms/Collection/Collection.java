package samplePrograms.Collection;

import java.util.ArrayList;
import java.lang.String;
import java.util.Iterator;
import java.util.List;

public class Collection {

	public static void main(String [] args) {

		Integer removEle= 20;
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(50);
		myList.add(80);
		System.out.println("List Before Removing Element: ");
		System.out.println(myList);
		Iterator<Integer> itr = myList.iterator();
		while(itr.hasNext()) {
			if(removEle.equals(itr.next())) {
				itr.remove();
			}
			
		}
		System.out.println("-------------------------------------------------");
		System.out.println("List After Removing Element");
		System.out.println(myList);
	}

}
