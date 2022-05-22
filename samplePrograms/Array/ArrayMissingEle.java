package samplePrograms.Array;

import java.util.Scanner;

public class ArrayMissingEle {
	
	   public static void main(String args[])   
	   {  
	       Scanner sc=new Scanner(System.in);
	 
	      int n;    //Declare array size
	      System.out.println("Enter the total number of elements ");
	      n=sc.nextInt();     //Initialize array size
	 
	      int arr[]=new int[n];   //Declare array
	      System.out.println("Enter the elements of the array ");
	      for(int i=0; i<n ;i++)     //Initialize array
	      {
	          arr[i]=sc.nextInt();
	      }
	      
	        int x1 = arr[0];
	        int x2 = 1;
	 
	        /* For xor of all the elements in array */
	        for (int i = 1; i < n; i++)
	            x1 = x1 ^ arr[i];
	 
	        /* For xor of all the elements  from 1 to n+1 */
	        for (int i = 2; i <= n + 1; i++) 
	        {
	            x2 = x2 ^ i;
	        }
	        int melement=x1 ^ x2;
	        System.out.println("Missing Element is "+melement);  //Print the missing element
	   }
	}

