package HakerRank;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.println("enter numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int hyp =(b*b)+(c*c); 
		int hyp1 =(a*a)+(b*b);
		int hyp2 =(a*a)+(c*c);
		if(hyp==(a*a)|| hyp1==(c*c)||hyp2==(b*b))
		{
			System.out.println("triangle is formed");
		}
		else {
			System.out.println("not a triangle");
		}

	}

}
