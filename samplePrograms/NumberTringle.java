package samplePrograms;
import java.util.Scanner;

public class NumberTringle {

	public static void main(String[] args) {	
		int n,num=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}		
	}
}
//Pint J            //Print i       //num=1; num , num++
//1  				//1 			//1
//1 2 				//2 2			//2 3
//1 2 3 			//3 3 3			//4 5 6
//1 2 3 4			//4 4 4 4 		//7 8 9 10
