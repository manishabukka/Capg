package HakerRank;

import java.util.Scanner;

public class AppOrg {
	public static void countAppOrg(int s,int t,int a,int b,int app[],int org[])
	{
		int c1=0,c2=0;
	
		for(int i=0;i<app.length;i++)
		{
		if((app[i]>=(s-a)) && (app[i]<=t) && (app[i]>=s))
		{
			c1++;
		}
			
		}
		System.out.println(c1);
		for(int i=0;i<org.length;i++)
		{
		if(((t-b)>=org[i]) && (org[i]<=s) && (org[i]>=t))
		{
			c2++;
		}
			
		}
		System.out.println(c2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,t,a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start and dest");
		s=sc.nextInt();
		t=sc.nextInt();
		System.out.println("enter distance of app and org ");
		a=sc.nextInt();
		b=sc.nextInt();
		int x,y,num;
		System.out.println("enter size ");
		int z=sc.nextInt();
		int app[]=new int[z];
		for(int i=0;i<app.length;i++)
		{
			num= sc.nextInt();
			app[i]=num;
		}
		System.out.println("enter size ");
		int z1=sc.nextInt();
		int org[]=new int[z1];
		for(int i=0;i<org.length;i++)
		{
			num= sc.nextInt();
			org[i]=num;
		}
		countAppOrg(s,t,a,b,app,org);

	}

}
