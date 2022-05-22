package samplePrograms.Array;

import java.util.HashSet;

public class ArrayRemDupUnSorted {

	public static void main(String[] args) {
		
		int a[]= {2,5,8,3,5,6,9,10,2,5,6,9};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println("List after removal of duplicates element : ");
		for( int temp : set )
		{
			
			System.out.print(temp + " ");
		}

	}

}
