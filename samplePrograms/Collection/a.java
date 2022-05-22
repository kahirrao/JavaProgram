package samplePrograms.Collection;

import java.util.Arrays;
import java.util.Collections;

public class a {

	public static void main(String[] args) {

		String [] myArray = {"one","two","five","six","eight"}; 
        System.out.println("Original Array:" + Arrays.asList(myArray));
        
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed Array:" + Arrays.asList(myArray)); 

	}

}
