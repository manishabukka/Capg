package HakerRank;

import java.util.Arrays;
import java.util.Scanner;

public class GreaterNumThanAvg {
	
	public static void great()
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int v=sc.nextInt();
		int arr[]=new int[v];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
			
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		
		}
		int c=(sum/arr.length);
		System.out.println(c);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>c)
			{
				System.out.println(arr[i]);
			}
		}
		
		}
	

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			great();
			

	}

}
