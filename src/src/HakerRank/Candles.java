package HakerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Candles {
	public static int birthdayCakecandles(long[] arr,int num)
	{ 
		int x,c1=0;
		int l=arr.length;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=arr[l-1])
			{
				c1++;
			}
			
			
			
			//System.out.println(arr[i]);
			
		}

	 return c1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int can,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of candles");
		can=sc.nextInt();
		long arr[]=new long[can];
		for(int i=0;i<arr.length;i++)
		{
			num= sc.nextInt();
			arr[i]=num;
		}
		int res=birthdayCakecandles(arr,can);
		System.out.println(res);

	}

}
