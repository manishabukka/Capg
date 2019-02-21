package HakerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Seven {
	public static void seven()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int v=sc.nextInt();
		int arr[]=new int[v];
		
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]= sc.nextInt();
			
		}
		int l=arr.length;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==7)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}for (int j = 0;j<arr.length; j++) {
				System.out.print(arr[j]);
			}
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
seven();
	}

}
