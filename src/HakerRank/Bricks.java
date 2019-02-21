package HakerRank;

import java.util.Scanner;

public class Bricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,p=0,m=0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of bricks:");
		l=sc.nextInt();
		for (int i = 1; i < l/2; i++) {
			p=i;
			m=i*2;
			sum=sum+(i+i*2);
		}
		if(sum>=l)
		{
			if((sum-(m))<=l) {
				System.out.println("patlu");
				
			}
			else
			{
				System.out.println("motu");
			}
		}
		
		
		
		

	}

}
