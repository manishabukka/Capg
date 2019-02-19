package HakerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLarge {
	
	public static int small(int[] arr,int n)
	{
		int a=arr[n-1];
		return a;
		}
	
		
	public static int large(int[] arr,int n)
	{
		int b=arr[arr.length-n];
		return b;
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,ab;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int v=sc.nextInt();
		int arr[]=new int[v];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
			
		}
		Arrays.sort(arr);
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		System.out.println("you want small or large");
		String h= sc.next();
		System.out.println("enter Kth ");
		int z=sc.nextInt();
		
		int a=small(arr,z);
		int b= large(arr,z);
		System.out.println(a);
		System.out.println(b);
	}

}
