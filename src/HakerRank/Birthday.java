package HakerRank;

import java.util.Scanner;

public class Birthday {
	public static void main(String[] args) {
		int n,m,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter test cases");
		t=sc.nextInt();
		while(t!=0)
		{
		System.out.println("enter number");
		n=sc.nextInt();
		System.out.println("enter choc:");
		m=sc.nextInt();
		if((m%n)==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		}t--;
		

}
}
