package HakerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
	public static void ascending()
	{
		int j=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		
		int v=sc.nextInt();
		int arr[]=new int[v];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]= sc.nextInt();
			
		}
		System.out.println("enter size");
		int v1=sc.nextInt();
		int arr1[]=new int[v1];
		for(int i=0;i<arr1.length;i++)
		{
			
			arr1[i]= sc.nextInt();
			
		}
		
		int c[] = new int[v+v1];
		for (int i = 0; i < c.length; i++) {
			if(i<arr.length)
			{
				c[i]=arr[i];
			}
			else {
				c[i]=arr1[j];
				j++;
			}
			
		}Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ascending();
	}
}
