package samplePrograms.String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StrDuplicate {

	   public static void main(String args[])   
	    {   
	        //Create string variable with default value  
	        String str;
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a String : ");
	        str=sc.nextLine();
	        String str1= str.toLowerCase();
	        //removeDuplicates() method by passing the string as an argument 
	        System.out.print("String After Removal of duplicate:");
	        removeDuplicates(str1.replace(" ", ""));   
	        
	    }    
		    static void removeDuplicates(String str1)   
		    {          
		        LinkedHashSet<Character> set = new LinkedHashSet<>();   
		      
		        for(int i=0;i<str1.length();i++)   
		            set.add(str1.charAt(i));       
		        
		        for(Character ch : set)    
		            System.out.print(ch);   
		    	set.remove(set);   
		    }   		 
		   
		} 

