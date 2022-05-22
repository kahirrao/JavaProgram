package samplePrograms.Array;

public class ArrayRemDupSorted {

	public static void main(String[] args) {


		int a[] = {1,2,2,5,5,5,8,9,9,9};
		
		int j=0;
		for(int i=0; i<a.length-1;i++)
		{
			if(a[i] != a[i+1])
			{
				a[j] = a[i];
				j++;
			}
		}
		a[j] = a[a.length-1];
		
		for(int i=0;i<j+1;i++)
		{
			System.out.print(a[i] + " ");
		}

	}

}
