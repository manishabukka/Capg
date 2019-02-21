package HakerRank;

import java.util.Scanner;

public class ArrayEvenOdd {
	public static void evenOdd()
	{
		int v,counter=0,counter1=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		
		 v=sc.nextInt();
		int arr[]=new int[v];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]= sc.nextInt();
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]%2)==0)
			{
				counter++;
				
				
			}
			else {
				counter1++;
				
			}
		}System.out.println(counter+" "+counter1);
			int c[]=new int[counter];
			int b[]=new int[counter1];
			int total[]= new int[counter1+counter];
			int x=0;
			for (int i = 0; i < arr.length; i++) {
				
			
			if((arr[i]%2)==0)
			{
				c[x]=arr[i];
				x++;
				
				
			}
			}
			int n=0;
			for (int i = 0; i < arr.length; i++) {
				
				
				if((arr[i]%2)!=0)
				{
					b[n]=arr[i];
					n++;
					
					
				}
				}
			
			int d=0;
			for (int i = 0; i < total.length; i++) {
				if(i<c.length) {
				total[i]=c[i];
				}
				else
				{
					total[i]=b[d];
					d++;
				}
				
			}for (int i = 0; i < total.length; i++) {
				System.out.println(total[i]);
			}
				
			
			
				
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOdd();

	}

}
