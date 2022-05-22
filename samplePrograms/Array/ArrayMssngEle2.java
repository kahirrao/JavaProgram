package samplePrograms.Array;

public class ArrayMssngEle2 {

	public static int missngNumbers(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
          sum-=nums[i];
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a = { 1,3,4,5,6,7};
        System.out.println("Missing Number: " + missngNumbers(a));
    }
}

