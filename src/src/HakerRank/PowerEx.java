package HakerRank;

import java.util.Scanner;

import Exceptions.MyException;

public class PowerEx {
	
	public static void powerEq(int[] base,int[]pow) throws Exception
	{  
		
			for(int i=0;i<pow.length;i++)
			{
				try {
					if((base[i]>0) && (pow[i]>0)) {
						
				int res=(int)Math.pow(base[i],pow[i]);
				System.out.println(res);
					}
					else if((base[i]==0) && (pow[i]==0))
					{
						throw new Exception("base and pow are zero");
					}
					else if((base[i]<0) && (pow[i]<0))
					{
						throw new Exception("base and pow are zero");
					}
				 
			}
		catch (Exception e) {
			System.out.println(e);
				
			}
			
			// TODO: handle exception
			
		
			}
	}

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter size ");
		int z=sc.nextInt();
		int base[]=new int[z];
		for(int i=0;i<base.length;i++)
		{
			num= sc.nextInt();
			base[i]=num;
		}
		System.out.println("enter size ");
		int z1=sc.nextInt();
		int pow[]=new int[z1];
		for(int i=0;i<pow.length;i++)
		{
			num= sc.nextInt();
			pow[i]=num;
		}
		powerEq(base,pow);

	}

}
