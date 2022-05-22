package samplePrograms.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class StrDuplicate2 {

	   public static void main(String args[])   
	    {   
	        String str= "kalpeshahirrao";//make sure you will pass string in upper case or lower case
	         
	
		        LinkedHashSet<Character> set = new LinkedHashSet<>();   
		      
		        for(int i=0;i<str.length();i++)   
		            set.add(str.charAt(i));       
		        
		        for(Character ch : set)   
		            System.out.print(ch);   
	    }
  		   
		} 
